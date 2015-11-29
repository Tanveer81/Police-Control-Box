package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    Stage stage;
    HomeController homeControl;
    myPostsController PostControl;
    developerController developerControl;
    noticeController noticeControl;
    contactsController contactsControl;
    signUpController signUpControl;
    logInController logInControl;
    profileController profileControl;
    public ArrayList<String> message=new ArrayList<String>();
    public String mood;
    public Client client;
    public Person p;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        client=new Client();
        p=new Person();
        showLogIn();
    }

    public void showLogIn() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();
        logInController controller = loader.getController();
        logInControl=controller;
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        controller.setMain(this);
    }

    public void showSignUp() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Signup.fxml"));
        Parent root = loader.load();
        signUpController controller = loader.getController();
        controller.setMain(this);
        signUpControl=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();

    }

    public void showHome() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        HomeController controller = loader.getController();
        homeControl=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        controller.setMain(this);
    }

    public void showMyPosts() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("myPosts.fxml"));
        Parent root = loader.load();

        // Loading the controller
        myPostsController controller = loader.getController();
        controller.setMain(this);
        PostControl=controller;

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

    public void showProfile() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("profile.fxml"));
        Parent root = loader.load();
        profileController controller = loader.getController();
        controller.setMain(this);
        profileControl=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();

    }

}