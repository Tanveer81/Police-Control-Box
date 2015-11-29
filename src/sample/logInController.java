package sample;

/**
 * Created by emon on 11/27/2015.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class logInController {
    private Main main;
    public void setMain(Main main) {
        this.main = main;
    }
    @FXML
    private TextField Uname;

    @FXML
    private PasswordField Pword;

    public void logInAction(ActionEvent event){
        try {
            NetworkUtil nu=main.client.nc;
            Person p=main.p;
            p.setName(Uname.getText());
            p.setPassword(Pword.getText());
            p.setMood("login");
            new WriteThread(nu,p);
            new ReadThread(nu,main);
        } catch (Exception e) {
            
        }
    }

    public void signUpAction(ActionEvent event) {
        try {
            main.showSignUp();
        }catch (Exception e)
        {

        }
    }
}
