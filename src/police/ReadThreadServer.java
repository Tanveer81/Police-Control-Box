package police;

import util.NetworkUtil;
import util.Person;


public class ReadThreadServer implements Runnable {
    private Thread thr;
    private NetworkUtil nc;
    Main main;

    public ReadThreadServer(NetworkUtil nc, Main main) {
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
                    if(o instanceof util.Person) {
                        Person obj=(Person)o;
                        System.out.println(obj.getName());
                        if(!main.hasGot) {
                            nc.write(obj);
                            main.hasGot=true;
                        }
                    }
                }
                //String s=(String)nc.read();
                //System.out.println(s);
                main.hasGot=true;
                //nc.write("vaid");
                //if(main.hasGot==true) {
                   // if (s == "loginpn") nc.write("vaid");
                    //else nc.write("invalid");
                   // main.hasGot=false;
                //}
                /*Object o=nc.read();
                if(o!= null) {
                    //if(o instanceof Person) {
                        System.out.println("Connected");
                        Person obj=(Person)o;
                        main.P=obj;
                        main.hasGot=true;
                        if(obj.getPassword().equals("p")&&obj.getName().equals("n")){
                            obj.setValidlogin(true);
                        }
                        nc.write(obj);
                    //}*/
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}
