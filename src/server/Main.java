package server;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NetworkUtil;
import util.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

public class Main extends Application {
    Stage stage;
    policeHomeController homeControl;
    allPostsController allPostControl;
    developerController developerControl;
    noticeController noticeControl;
    usersController usersControl;
    singleUserController singleUserControl;
    contactsController contactsControl;
    public Person P;
    Boolean hasGot=false;
    public Hashtable<String, NetworkUtil> hashtable=new Hashtable<String,NetworkUtil>();
    final ObservableList<Data> data = FXCollections.observableArrayList();

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
        controller.allPosts.setItems(data);
        controller.initializeColumns();
        // Set the primary stage
        stage.setTitle("Police Control Box");
        stage.setScene(new Scene(root, 1000, 600));
        stage.show();
        stage.setResizable(false);

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
        stage.setResizable(false);
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
        stage.setResizable(false);
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
        stage.setResizable(false);
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
        stage.setResizable(false);
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
        stage.setResizable(false);
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
        stage.setResizable(false);
    }



    //DATABASE

    public static void listClient()
    {
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        try
        {
            String query = "select * from client";
            ResultSet rs = oc.searchDB(query);
            System.out.println("client List");
            System.out.println("id   name  email  fName  mName  presentAddress  permanentAddress  vooterID  mobileNo  dob");
            while(rs.next())
            {
                System.out.print(rs.getInt("id"));
                System.out.print("	");
                System.out.print(rs.getString("name"));
                System.out.print("	");
                System.out.print(rs.getString("email"));
                System.out.print("	");
                System.out.print(rs.getString("fName"));
                System.out.print("	");
                System.out.print(rs.getString("mName"));
                System.out.print("	");
                System.out.print(rs.getString("presentAddress"));
                System.out.print("	");
                System.out.print(rs.getString("permanentAddress"));
                System.out.print("	");
                System.out.print(rs.getString("vooterID"));
                System.out.print("	");
                System.out.print(rs.getInt("mobileNo"));
                System.out.print("	");
                System.out.print(rs.getString("dob"));
                //longText 4294967295
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in listClient: " + e);
        }
        finally
        {
            oc.close();
        }
    }

    public static void addClient(int id, String name,String email, String fName,String mName,String presentAddress,
                                 String permanentAddress,String vooterID,String mobileNo,String dob)
    {
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        try
        {
            String query = String.format("select * from client where id = %d", id);
            ResultSet rs = oc.searchDB(query);
            if(rs.next())
            {
                System.out.println("client with this Id already exists");
            }
            else
            {
                String insertQuery = String.format("insert into client(id, name, email,fName,mName,presentAddress,permanentAddress,vooterID,mobileNo,dob) values (%d, '%s', '%s','%s','%s','%s','%s','%s','%s','%s')",
                        id, name,  email,fName,mName,presentAddress,permanentAddress,vooterID,mobileNo,dob);
                oc.updateDB(insertQuery);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in addClient: " + e);
        }
        finally
        {
            oc.close();
        }
    }

    public static int getCnt(){
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        String query = "select * from cnt2";
        ResultSet rs = null;
        try {
            rs = oc.searchDB(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i= 1;
        try {
            while(rs.next()){i++;}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void addCnt(int clientCount)
    {
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        try
        {
            String str = Integer.toString(clientCount);
            String insertQuery = String.format("insert into cnt2(id,clientCount) values ('%s','%s')",str,str);
            oc.updateDB(insertQuery);
        }

        catch(Exception e)
        {
            System.out.println("Exception in addClientCount: " + e);
        }
        finally
        {
            oc.close();
        }
    }

    public static void addPost(String id,String post){
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        try
        {
            String insertQuery = String.format("insert into emnipost(id,post) values ('%s','%s')",id,post);
            oc.updateDB(insertQuery);
        }

        catch(Exception e)
        {
            System.out.println("Exception in addClientCount: " + e);
        }
        finally
        {
            oc.close();
        }

    }
    public static String getPost(String vooterID){
        MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
        String query = "select * from emnipost";
        ResultSet rs = null;
        String a="";
        try {
            rs = oc.searchDB(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            while(rs.next()){
                if(rs.getString("vooterID").equals(vooterID)){
                    a=a+"@"+rs.getString("post");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

