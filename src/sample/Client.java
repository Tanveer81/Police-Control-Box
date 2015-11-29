package sample;

/**
 * Created by emon on 11/28/2015.
 */
public class Client {
    public NetworkUtil nc;
    Client(){
        try {
            String serverAddress = "127.0.0.1";
            int serverPort = 33333;
            nc = new NetworkUtil(serverAddress,serverPort);
        } catch(Exception e) {
            System.out.println (e);
        }
    }

}
