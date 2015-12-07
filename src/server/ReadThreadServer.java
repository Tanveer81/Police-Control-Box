package server;

import util.NetworkUtil;
import util.Person;

import java.sql.ResultSet;


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
                        main.hashtable.put(obj.getName(),nc);
                        System.out.println(obj.getName());
                        if(obj.getMood().equals("signup")){
                            int i=main.getCnt();
                            i++;
                            main.addCnt(i);
                            main.addClient(i,obj.getName(),obj.getEmail(),obj.getfName(),obj.getmName(),obj.getPresentAddress(),
                                    obj.getPerAddress(),obj.getVoterId(),obj.getMobileNo(),"2012-02-13");
                            main.listClient();
                        }
                        else if(obj.getMood().equals("login")) {
                            MySQLConnect oc=new MySQLConnect("localhost","PCB","root","Tanveer@81");
                            String query = "select * from client";
                            ResultSet rs = oc.searchDB(query);
                            while(rs.next())
                            {
                                if(rs.getString("vooterID").equals(obj.getName())){
                                        if(rs.getString("passWord").equals(obj.getPassword())){
                                            obj.setValidlogin(true);
                                        }
                                        else obj.setValidlogin(false);
                                        break;
                            }
                            }
                        }
                        else if(obj.getMood().equals("post")) {
                            main.addPost(obj.getName(),obj.getPost());
                            main.data.add(new Data(obj.getName(),obj.getPost()));
                            main.homeControl.allPosts.setItems(main.data);
                        }

                        nc.write(obj);
                    }
                }
                main.hasGot=true;
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}
