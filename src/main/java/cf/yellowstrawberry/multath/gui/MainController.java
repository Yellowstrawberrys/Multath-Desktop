package cf.yellowstrawberry.multath.gui;

import cf.yellowstrawberry.multath.data.DataManager;
import cf.yellowstrawberry.multath.data.Enums.QuestionType;
import cf.yellowstrawberry.multath.data.System.NumberToStar;
import cf.yellowstrawberry.multath.system.SystemManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    ScrollPane scrollpane;

    @FXML
    FlowPane questions;

    public MainController() {

    }

    public void init() throws IOException {
        for(int i=0; i < 20; i++){
            //Load Quiz Preset
            Parent root = DataManager.loadCustomParent("Quiz.fxml");

            //Getting Nodes
            Text QuestionName = (Text) root.lookup("#Title");
            Text Example = (Text) root.lookup("#Ex");
            Button StartButton = (Button) root.lookup("#start");
            Label rating = (Label) root.lookup("#Rating");

            Random r = new Random();

            //Setting Text
            QuestionName.setText((i+1)+". Multiply Questions");
            Example.setText(String.format("%s ⨉ %s = ?", r.nextInt(8)+1, r.nextInt(8)+1));
            rating.setText(NumberToStar.toStar(r.nextInt(5)));

            //Setting Buttons
            if(!SystemManager.isFinishedQuestion(i)){
                int finalI = i;
                EventHandler<ActionEvent> buttonHandler = event -> SystemManager.setQuestion(1, finalI, QuestionType.Multiplication);
                StartButton.setOnAction(buttonHandler);
            }else{
                StartButton.setText("Finished");
                StartButton.setDisable(true);
            }

            questions.getChildren().add(root);

            questions.setPrefWidth(142*(i+1));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}