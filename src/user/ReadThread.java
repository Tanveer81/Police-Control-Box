package user;

import util.NetworkUtil;
import util.Person;

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
                        System.out.println(obj.getPassword());
                        main.showHome();

                    }
                }
            }
        } catch(Exception e) {
            System.out.println (e+"readThread");
        }
        nc.closeConnection();
    }
}
