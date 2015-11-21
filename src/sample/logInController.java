package sample;

import javafx.event.ActionEvent;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

/**
 * Created by Hp on 11/16/2015.
 */
public class logInController {
    private Main main;
    @FXML
    private Button logIn;
    public void setMain(Main main) {
        this.main = main;
    }

   public void loginAction(ActionEvent event) {
       FXMLLoader loader2 = new FXMLLoader();
       loader2.setLocation(getClass().getResource("signUp.fxml"));
       Parent root2 = null;
       try {
           root2 = loader2.load();
       } catch (IOException e) {
           e.printStackTrace();
       }
       signUpController controller = loader2.getController();
       controller.setMain(main);
       Scene scene2 = new Scene(root2, 1000, 600);
       //stage.hide();//optional
       main.stage.setScene(scene2);
       main.stage.show();
    }
}
