package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class signUpController {

    private Main main;
    @FXML
    private TextField vid;
    @FXML
    private TextField fname;
    @FXML
    private PasswordField repword;
    @FXML
    private TextField name;
    @FXML
    private PasswordField pword;
    @FXML
    private TextField mname;
    @FXML
    private Button signUp;
    @FXML
    private Button home;
    @FXML
    private TextField address;
    @FXML
    private TextField peraddress;
    @FXML
    private TextField mno;

    public void setMain(Main main) {
        this.main = main;
    }

    public void setSignUp(ActionEvent event) throws Exception {
        try {
            if(name.getText().isEmpty()||fname.getText().isEmpty()||mname.getText().isEmpty()||pword.getText().isEmpty()||vid.getText().isEmpty()||address.getText().isEmpty()||peraddress.getText().isEmpty()||mno.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid");
                alert.setHeaderText("Cannot Sign Up");
                alert.setContentText("You must provide all informations");
                alert.showAndWait();
            }
             else{
                if(pword.getText().equals(repword.getText())) {
                    NetworkUtil nu = main.client.nc;
                    Person p = main.p;
                    p.setName(name.getText());
                    p.setPassword(pword.getText());
                    p.setfName(fname.getText());
                    p.setmName(mname.getText());
                    p.setVoterId(vid.getText());
                    p.setPresentAddress(address.getText());
                       p.setPerAddress(peraddress.getText());
                    p.setMobileNo(mno.getText());
                    p.setMood("signup");
                    //nu.write(p);
                    new WriteThread(nu,p);
                    main.showHome();
                }
               else{
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid");
                    alert.setHeaderText("Cannot Sign Up");
                    alert.setContentText("Password did not match");
                    alert.showAndWait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void showHome(ActionEvent event) {
        try {
            main.showLogIn();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
    }
}
