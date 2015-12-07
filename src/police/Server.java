package police;

import util.NetworkUtil;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by emon on 11/29/2015.
 */
public class Server implements Runnable{
    private Main main;
    private ServerSocket ServSock;
    private Thread thr;
    Server(Main main){
        this.main=main;
    }
    @Override
    public void run() {
        try {
            ServSock = new ServerSocket(33333);
            while (true) {
                Socket clientSock = ServSock.accept();
                NetworkUtil nc=new NetworkUtil(clientSock);
                new ReadThreadServer(nc,main);
                /*if(main.hasGot==true){
                   new WriteThreadServer(nc,main);
                    Person P1=main.P;
                    if(P1.getPassword().equals("p")&&P1.getName().equals("n")){
                        P1.setValidlogin(true);
                    }
                    new WriteThreadServer(nc,main);
                    main.hasGot=false;
                }*/
            }
        }catch(Exception e) {
            System.out.println("Server starts:"+e);
        }

    }
}
