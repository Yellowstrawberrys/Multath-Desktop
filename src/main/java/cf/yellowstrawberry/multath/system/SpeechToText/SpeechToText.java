package cf.yellowstrawberry.multath.system.SpeechToText;

import cf.yellowstrawberry.multath.data.System.EnglishToNumber;
import org.json.JSONObject;
import org.vosk.LibVosk;
import org.vosk.LogLevel;
import org.vosk.Model;
import org.vosk.Recognizer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.sound.sampled.*;

public class SpeechToText extends Thread{
    TargetDataLine microphone;
    SourceDataLine speakers;
    boolean isOn = true;

    public void run() {
        LibVosk.setLogLevel(LogLevel.INFO);

        AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 60000, 16, 2, 4, 44100, false);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

        try (Model model = new Model("C:\\Users\\Yellowstrawberry\\IdeaProjects\\Multath\\src\\main\\resources\\cf\\yellowstrawberry\\multath\\system\\SpeechToText\\model");
             Recognizer recognizer = new Recognizer(model, 120000)) {
            try {

                microphone = (TargetDataLine) AudioSystem.getLine(info);
                microphone.open(format);
                microphone.start();

                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int numBytesRead;
                int CHUNK_SIZE = 1024;
                int bytesRead = 0;

                DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
                speakers = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
                speakers.open(format);
                speakers.start();
                byte[] b = new byte[4096];

                while (bytesRead <= 100000000 && isOn) {
                    numBytesRead = microphone.read(b, 0, CHUNK_SIZE);
                    bytesRead += numBytesRead;

                    out.write(b, 0, numBytesRead);

                    speakers.write(b, 0, numBytesRead);

                    if (recognizer.acceptWaveForm(b, numBytesRead)) {
                        String currentText = new JSONObject(recognizer.getFinalResult()).getString("text");
                        if(!(currentText.isBlank() || currentText.isEmpty())){
                            if(currentText.startsWith("answer is")){
                                System.out.println(EnglishToNumber.convert(currentText.replaceFirst("answer is", "")));
                            }
                        }
                    }
                }
                System.out.println(recognizer.getFinalResult());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void interrupt() {
        speakers.close();
        microphone.close();
        speakers.drain();
        isOn = false;
    }
}
