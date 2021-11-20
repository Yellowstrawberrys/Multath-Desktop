package cf.yellowstrawberry.multath;

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
        new Connection();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.getIcons().add(new Image(Starter.class.getResource("logo.png").toString()));
        primaryStage.setTitle("Multath");
        Scene scene = new Scene(FXMLLoader.load(Starter.class.getResource("Login.fxml")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
