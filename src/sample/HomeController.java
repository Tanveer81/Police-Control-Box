package sample;

/**
 * Created by emon on 11/27/2015.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class HomeController {
    private Main main;
    public void setMain(Main main)
    {
        this.main=main;
    }

    @FXML
    private TextArea postText;

    @FXML
    private Button Telephone;

    @FXML
    private Button Traffic;

    @FXML
    private Button MyPost;

    @FXML
    private Button MyInfo;

    @FXML
    private TableView<?> newsFeed;

    @FXML
    private Button postButton;

    @FXML
    private Button Home;
    public void sendpost(){
        NetworkUtil nu=main.client.nc;
        Person p=main.p;
        p.setMood("post");
        p.setClientpost(postText.getText());
        new WriteThread(nu,p);
    }
}

