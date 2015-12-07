package server;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class policeHomeController {
    Main main;
    void setMain(Main main){
        this.main=main;
        Image img = new Image(server.Main.class.getResourceAsStream("DMP logo.png"));
        dmpImage.setImage(img);
    }

    @FXML
    private TextArea postText;

    @FXML
    private Button developers;

    @FXML
    private ImageView dmpImage;

    @FXML
    public TableView<Data> allPosts;

    @FXML
    private Button postButton;

    @FXML
    private Button users;

    @FXML
    private Button contacts;

    @FXML
    private Text notice;

    @FXML
    private Button home;

    @FXML
    private Button noticeButton;

    @FXML
    private Button allPostsButton;



    @FXML
    void sendPost(ActionEvent event) {

    }

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
    void showAllPosts(ActionEvent event) {
        try {
            main.showAllPosts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void initializeColumns() {
        TableColumn<Data, String> name = new TableColumn<>("Name");
        name.setMinWidth(100);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        name.setCellFactory(TextFieldTableCell.<Data>forTableColumn());

        /*name.setOnEditCommit(
                (TableColumn.CellEditEvent<Data, String> t) -> {
                    ((Data) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setFirstName(t.getNewValue());
                }
        );*/

        TableColumn<Data, String> post = new TableColumn<>("Post");
        post.setMinWidth(740);
        post.setCellValueFactory(new PropertyValueFactory<>("post"));
        post.setCellFactory(TextFieldTableCell.<Data>forTableColumn());

        /*post.setOnEditCommit(
                (TableColumn.CellEditEvent<Person, String> t) -> {
                    ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setLastName(t.getNewValue());
                }
        );*/


        TableColumn<Data, String> actionCol = new TableColumn<>("Action");
        actionCol.setCellValueFactory(new PropertyValueFactory<>("action"));

        Callback<TableColumn<Data, String>, TableCell<Data, String>> cellFactory =
                new Callback<TableColumn<Data, String>, TableCell<Data, String>>() {
                    @Override
                    public TableCell call(final TableColumn<Data, String> param) {
                        final TableCell<Data, String> cell = new TableCell<Data, String>() {
                            final Button btn = new Button("Seen");

                            @Override
                            public void updateItem(String item, boolean empty) {
                                super.updateItem(item, empty);
                                if (empty) {
                                    setGraphic(null);
                                    setText(null);
                                } else {
                                    // action of 'Select' button click
                                    btn.setOnAction((ActionEvent event) -> {
                                                main.data.remove(getIndex());
                                            }
                                    );
                                    setGraphic(btn);
                                    setText(null);
                                }
                            }
                        };
                        return cell;
                    }
                };
        actionCol.setCellFactory(cellFactory);

        allPosts.getColumns().addAll(name, post, actionCol);
    }
}
