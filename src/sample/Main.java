package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.logInController;

import java.util.ArrayList;

public class Main extends Application {

    Stage stage;
    public ArrayList<String> message=new ArrayList<String>();
    public String mood;
    public Client client;
    public Person p;
    //public  MessageController mcontroller;
    //public SampleController scontroller;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        client=new Client();
        p=new Person();
        showLogIn();
    }

    public void showLogIn() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
        logInController controller = loader.getController();
        //scontroller=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        controller.setMain(this);
    }

    public void showSignUp() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Signup.fxml"));
        Parent root = loader.load();
        signUpController controller = loader.getController();
        //mcontroller=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        controller.setMain(this);
    }
    public void showHome() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        HomeController controller = loader.getController();
        //mcontroller=controller;
        stage.setTitle("Client");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        controller.setMain(this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}