package cf.yellowstrawberry.multath.gui;

import cf.yellowstrawberry.multath.data.DataManager;
import cf.yellowstrawberry.multath.system.SystemManager;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
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

            //Setting Text
            QuestionName.setText("1-9 Multiply Questions");
            Example.setText("5 ⨉ 9 = ?");

            //Setting Buttons
            if(!SystemManager.isFinishedQuestion(i)){
                int finalI = i;
                StartButton.addEventFilter(EventType.ROOT, event -> SystemManager.setQuestion(1, finalI));
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