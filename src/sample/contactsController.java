package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class contactsController {
    Main main;
    void setMain(Main main){
        this.main=main;
        //Image img = new Image(police.Main.class.getResourceAsStream("DMP logo.png"));
       // dmpImage.setImage(img);
    }

    @FXML
    private Text notice;

    @FXML
    private TextArea postText;

    @FXML
    private Button developers;

    @FXML
    private ImageView dmpImage;

    @FXML
    private Button allPosts;

    @FXML
    private Button home;

    @FXML
    private TableView<?> newsFeed;

    @FXML
    private Button postButton;

    @FXML
    private Button users;

    @FXML
    private Button contacts;

    @FXML
    private Button noticeButton;

    @FXML
    void sendPost(ActionEvent event) {

    }

    @FXML
    void showContacts(ActionEvent event) {
        try {
            main.showContacts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showDevelopers(ActionEvent event) {
        try {
            main.showDevelopers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showMyPosts(ActionEvent event) {
        try {
            main.showMyPosts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showHome(ActionEvent event) {
        try {
            main.showHome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showNotice(ActionEvent event) {
        try {
            main.showNotice();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showProfile(ActionEvent event) {
        try {
            main.showProfile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
