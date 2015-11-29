package sample;

import java.util.Scanner;

/**
 * Created by emon on 11/28/2015.
 */
public class WriteThread implements Runnable {

    private Thread thr;
    private NetworkUtil nc;
    Person p;

    public WriteThread(NetworkUtil nc,Person p) {
        this.nc = nc;
        this.p=p;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while(true) {
                nc.write(p);
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}
