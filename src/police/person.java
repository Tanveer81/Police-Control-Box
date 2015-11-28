package police;

import javafx.beans.property.SimpleStringProperty;


public class Person {
    private SimpleStringProperty name;
    private String password;
    private SimpleStringProperty post;
    private int voterId;
    private String mobileNo;
    private String fName;
    private String mName;
    private String presentAddress;
    private  String perAddress;



    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void setPost(String post) {
        this.name = new SimpleStringProperty(post);
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setPerAddress(String perAddress) {
        this.perAddress = perAddress;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getPost() {
        return post.get();
    }

    public int getVoterId() {
        return voterId;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public String getPerAddress() {
        return perAddress;
    }


}
