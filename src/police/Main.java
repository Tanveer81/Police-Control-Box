package police;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.Person;

public class Main extends Application {
    Stage stage;
    policeHomeController homeControl;
    allPostsController allPostControl;
    developerController developerControl;
    noticeController noticeControl;
    usersController usersControl;
    singleUserController singleUserControl;
    contactsController contactsControl;
    Person P;
    Boolean hasGot=false;


    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        try{
            showPoliceHome();
            Thread thr = new Thread(new Server(this));
            thr.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void showPoliceHome() throws Exception {
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("home.fxml"));
        Parent root = loader.load();

        // Loading the controller
        policeHomeController controller = loader.getController();
        controller.setMain(this);
        controller.setMain(this);
        homeControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showUsers() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("users.fxml"));
        Parent root = loader.load();

        // Loading the controller
        usersController controller = loader.getController();
        controller.setMain(this);
        controller.setMain(this);
        usersControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showSingleUser() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("singeUser.fxml"));
        Parent root = loader.load();

        // Loading the controller
        singleUserController controller = loader.getController();
        controller.setMain(this);
        controller.setMain(this);
        singleUserControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showAllPosts() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("allPosts.fxml"));
        Parent root = loader.load();

        // Loading the controller
        allPostsController controller = loader.getController();
        controller.setMain(this);
        controller.setMain(this);
        allPostControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showContacts() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("contacts.fxml"));
        Parent root = loader.load();

        // Loading the controller
        contactsController controller = loader.getController();
        controller.setMain(this);
        contactsControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showDevelopers() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("developer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        developerController controller = loader.getController();
        controller.setMain(this);
        developerControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }

    public void showNotice() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("notice.fxml"));
        Parent root = loader.load();

        // Loading the controller
        noticeController controller = loader.getController();
        controller.setMain(this);
        noticeControl=controller;

        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}

