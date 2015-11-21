package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

import java.io.IOException;

import static javafx.stage.Stage.*;

public class Main extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // XML Loading using FXMLLoader

        stage = primaryStage;
        primaryStage.setTitle("Police control box");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("logIn.fxml"));
        Parent root = loader.load();

        // Loading the controller
        logInController controller = loader.getController();
        controller.setMain(this);
        Scene scene1=new Scene (root,1000,600);
        stage.setScene(scene1);
        //Stage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

   /* public void showLogIn() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("logIn.fxml"));
        Parent root = loader.load();

        // Loading the controller
        logInController controller = loader.getController();
        controller.setMain(this);
        Scene scene1=new Scene (root,1000,600);
        stage.setScene(scene1);
        stage.show();
        // Set the primary stage
        //

    }
    public void showSignUp(){
        // XML Loading using FXMLLoader
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("signUp.fxml"));
        Parent root2 = null;
        try {
            root2 = loader2.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        signUpController controller = loader2.getController();
        controller.setMain(this);
        Scene scene2 = new Scene(root2, 1000, 600);
        //stage.hide();//optional
        stage.setScene(scene2);
        stage.show();


    }
*/
    public static void main(String[] args) {
        launch(args);
    }
}
