package cf.yellowstrawberry.multath;

import cf.yellowstrawberry.multath.data.DataManager;
import cf.yellowstrawberry.multath.system.connection.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Starter extends Application {

    public static void main(String[] args) {
//        new Connection();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.getIcons().add(new Image(Starter.class.getResource("logo.png").toString()));
        primaryStage.setTitle("Multath");
        primaryStage.setScene(DataManager.getSceneByID(1));
        primaryStage.show();
        DataManager.init(primaryStage);
    }
}
