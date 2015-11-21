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
public class signUpController {
    private Main main;

    @FXML
    private Button signUp;

    public void setMain(Main main) {
        this.main = main;
    }

    public void loginAction(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("logIn.fxml"));
            Parent root = loader.load();

            // Loading the controller
            logInController controller = loader.getController();
            controller.setMain(main);
            Scene scene1=new Scene (root,1000,600);
            main.stage.setScene(scene1);
            main.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
