package user;

/**
 * Created by emon on 11/27/2015.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import util.Person;

public class HomeController {
    private Main main;
    public void setMain(Main main) {
        this.main=main;
        Image img = new Image(police.Main.class.getResourceAsStream("DMP logo.png"));
        dmpImage.setImage(img);
    }
    @FXML
    private Button Home;
    public void sendpost(){
        //NetworkUtil nu=main.client.nc;
        Person p=main.p;
        p.setMood("post");

        //new WriteThread(nu,p);
    }
    @FXML
    private Button postButton;

    @FXML
    private TextArea postText;

    @FXML
    private Button noticeButton;

    @FXML
    private MenuButton post;

    @FXML
    private Button developers;

    @FXML
    private Button profile;

    @FXML
    private ImageView dmpImage;

    @FXML
    private TableView<?> allPosts;

    @FXML
    private Button contacts;

    @FXML
    private Text notice;

    @FXML
    private Button allPostsButton;

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

