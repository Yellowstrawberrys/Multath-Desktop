package cf.yellowstrawberry.multath.gui;

import cf.yellowstrawberry.multath.data.DataManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    Button Login;

    @FXML
    TextField id;

    @FXML
    PasswordField password;

    public void login(){
        if(!id.getText().replaceAll(" ","").isBlank() && !password.getText().replaceAll(" ","").isBlank()){
            DataManager.getStage().setScene(DataManager.getSceneByID(2));
        }
    }
}