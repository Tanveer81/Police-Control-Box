package police;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class policeHomeControl {

    Main main;
    void setMain(Main main){
        this.main=main;
    }


    @FXML
    private TextArea postText;

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

    @FXML
    void sendPost(ActionEvent event) {

    }

}

