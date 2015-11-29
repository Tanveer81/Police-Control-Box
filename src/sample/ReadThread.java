package sample;

import javafx.scene.control.Alert;

/**
 * Created by emon on 11/28/2015.
 */

public class ReadThread implements Runnable {
    private Thread thr;
    private NetworkUtil nc;
    Main main;

    public ReadThread(NetworkUtil nc,Main main) {
        this.nc = nc;
        this.thr = new Thread(this);
        this.main=main;
        thr.start();
    }

    public void run() {
        try {
            while(true) {
                Object o=nc.read();
                if(o!= null) {
                    if(o instanceof Person) {
                        Person obj=(Person)o;
                        if(obj.isValidlogin()==true){
                            main.showHome();
                        }
                        else{
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error");
                            alert.setHeaderText("Invalid ID");
                            alert.setContentText("Access Denied");
                            alert.showAndWait();
                        }
                    }
                }
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}
