package sample;

/**
 * Created by emon on 11/27/2015.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class logInController {
    private Main main;
    public void setMain(Main main) {
        this.main = main;
        //Image img = new Image(police.Main.class.getResourceAsStream("DMP logo.png"));
        //dmpImage.setImage(img);
    }

    @FXML
    private ImageView dmpImage;

    @FXML
    private Button logIn;

    @FXML
    private Button signUp;

    @FXML
    private TextField Uname;

    @FXML
    private PasswordField Pword;

    public void logInAction(ActionEvent event){
        try {
            //temporary stars
            main.showHome();
            //temporary ends
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
