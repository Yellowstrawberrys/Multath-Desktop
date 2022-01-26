package cf.yellowstrawberry.multath.gui;

import cf.yellowstrawberry.multath.data.DataManager;
import cf.yellowstrawberry.multath.data.Enums.Level;
import cf.yellowstrawberry.multath.data.Enums.QuestionType;
import cf.yellowstrawberry.multath.system.QuestionSession;
import cf.yellowstrawberry.multath.system.SpeechToText.SpeechToText;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class QuestionController {
    @FXML
    Label loc, timer, point, question;

    @FXML
    ImageView statusImg;

    boolean isSpeaking = true;

    private Thread SpeechToText;

    @FXML
    public void EnableSpeechToggle(){

    }

    @FXML
    public void initialize(){
        DataManager.questionSession = new QuestionSession(QuestionType.Adding, Level.One);
        SpeechToText = new SpeechToText();
        SpeechToText.start();
    }
}
