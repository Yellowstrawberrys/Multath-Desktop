package cf.yellowstrawberry.multath.system.connection;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class InputThread extends Thread {

    InputStream ipt;
    OutputStream opt;

    public InputThread(InputStream ipt, OutputStream opt){
        this.ipt = ipt;
        this.opt = opt;
    }

    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(ipt));
        while (true){
            try {
                String inputText = br.readLine();
                System.out.println("[1] "+inputText);

                if(inputText.isBlank() || inputText.isEmpty()){
                    System.out.println("<Blank/Empty>");
                }

                Thread.sleep(4000);
            } catch (SocketException e){
                this.stop();
            }catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
