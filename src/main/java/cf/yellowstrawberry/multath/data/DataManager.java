package cf.yellowstrawberry.multath.data;

import cf.yellowstrawberry.multath.Starter;
import cf.yellowstrawberry.multath.data.System.Program;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DataManager {
    public static void init(Stage primaryStage){
        Program.Stage = primaryStage;
    }

    public static Stage getStage(){
        return Program.Stage;
    }

    public static Scene getSceneByID(int ID){
        return switch (ID) {
            case 1 -> Program.LoginScene;
            case 2 -> Program.MainScene;
            case 3 -> Program.QuestionScene;
            default -> null;
        };
    }

    public static Parent loadCustomParent(String FileName) throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(Starter.class.getResource(FileName)));
    }
}
