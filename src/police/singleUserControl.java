package police;

import javafx.scene.image.Image;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class singleUserControl {
    Main main;
    void setMain(Main main){
        this.main=main;
        Image img = new Image(sample.Main.class.getResourceAsStream("DMP logo.png"));
        dmpImage.setImage(img);
    }

    @FXML
    private Button noticeButton;

    @FXML
    private Text occupation;

    @FXML
    private Button developers;

    @FXML
    private ImageView dmpImage;

    @FXML
    private Button allPosts;

    @FXML
    private Button home;

    @FXML
    private Text religion;

    @FXML
    private Text fName;

    @FXML
    private Text presentAddress;

    @FXML
    private Text name;

    @FXML
    private Text voterID;

    @FXML
    private Text permanentAddress;

    @FXML
    private Text mName;

    @FXML
    private Button contacts;

    @FXML
    private Text notice;

    @FXML
    void showUsers(ActionEvent event) {
        try {
            main.showUsers();
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
    void showContacts(ActionEvent event) {
        try {
            main.showContacts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void updateNotice(ActionEvent event) {
        try {
            main.showNotice();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showHome(ActionEvent event) {
        try {
            main.showPoliceHome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void showAllPosts(ActionEvent event) {
        try {
            main.showAllPosts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
