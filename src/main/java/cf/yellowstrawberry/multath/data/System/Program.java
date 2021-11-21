package cf.yellowstrawberry.multath.data.System;

import cf.yellowstrawberry.multath.Starter;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Program {
    public static Stage Stage;
    public static Scene LoginScene;
    public static Scene MainScene;
    public static Scene QuestionScene;

    static {
        try {
            LoginScene = new Scene(FXMLLoader.load(Objects.requireNonNull(Starter.class.getResource("Login.fxml"))));
            MainScene = new Scene(FXMLLoader.load(Objects.requireNonNull(Starter.class.getResource("Main.fxml"))));
            QuestionScene = new Scene(FXMLLoader.load(Objects.requireNonNull(Starter.class.getResource("Question.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
