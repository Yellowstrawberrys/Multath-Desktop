package cf.yellowstrawberry.multath.data;

import cf.yellowstrawberry.multath.Starter;
import cf.yellowstrawberry.multath.data.System.Program;
import cf.yellowstrawberry.multath.system.QuestionSession;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DataManager {

    public static QuestionSession questionSession;

    public static void init(Stage primaryStage){
        Program.Stage = primaryStage;
    }

    public static Stage getStage(){
        return Program.Stage;
    }

    public static Scene getSceneByID(int ID){
        if(ID == 1)return Program.LoginScene;else if(ID == 2)return Program.MainScene;else if(ID == 3)return Program.QuestionScene;else return null;
    }

    public static Parent loadCustomParent(String FileName) throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(Starter.class.getResource(FileName)));
    }
}
