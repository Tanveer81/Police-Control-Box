package user;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class profileController {
    private Main main;
    public void setMain(Main main)
    {
        this.main=main;
        Image img = new Image(police.Main.class.getResourceAsStream("DMP logo.png"));
        dmpImage.setImage(img);


    }

    @FXML
    private Button noticeButton;

    @FXML
    private Text occupation;

    @FXML
    private ImageView dmpImage;

    @FXML
    private Button allPosts;

    @FXML
    private Text mobileNo;

    @FXML
    private Button home;

    @FXML
    private Text religion;

    @FXML
    private Text fName;

    @FXML
    private Text presentAddress;

    @FXML
    private Text voterID;

    @FXML
    private Text name;

    @FXML
    private Button developer;

    @FXML
    private Text permanentAddress;

    @FXML
    private Text mName;

    @FXML
    private Button contacts;

    @FXML
    private Text notice;

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


}
