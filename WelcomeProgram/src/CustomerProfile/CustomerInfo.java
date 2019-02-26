package CustomerProfile;

import java.util.Scanner;

public class CustomerInfo {

    public  String userInputName;
    public String userInputPassword;
    private String userName;
    private String password;

    public void setUserName (String userName){

        this.userName = userName;

    }

    public void setPassword (String password){
        this.password = password;
    }

    public  String getUserName (){
        return userName;
    }
    public String getPassword () {
        return password;
    }

    public  CustomerInfo userInputDetails (){
        CustomerInfo customerInfo = new CustomerInfo();

        System.out.println("Enter Your User Name");
        Scanner scannerUserName = new Scanner(System.in);
        customerInfo.setUserName(scannerUserName.nextLine()); //set user input to setter method

        userInputName = customerInfo.getUserName(); //return user name

        System.out.println("Enter Your Password");
        Scanner scannerPassword = new Scanner(System.in);
        customerInfo.setPassword(scannerPassword.nextLine());//set user input to setter method

        userInputPassword = customerInfo.getPassword(); //return password

        return  customerInfo;

    }


}
