package UserData;


public class User{
    String name;
    String password;

    public User(String name , String password){
        this.name =name;
        this.password = password;
    }

    public String getUserName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
}