package VerifyCustomerInfo;

import CustomerProfile.CustomerInfo;
import UserData.User;
public class VerifyCustomerInfo {

    private User user1 = new User("Max","abc123");
    private User user2 = new User("Tim", "def123");
    private User user3 = new User("Sam", "ssf123");
    
    private User[] users = { user1, user2, user3 };

    // private String firstUserName = "Max";
    // private String secondUserName = "Tim";
    // private String firstUserPassword = "abc123";
    // private String secondUserPassword = "def123";
    

    
    // public boolean isUserExists = false;
    // public   boolean isMatchingUserNameAndPassword = false;


    // public VerifyCustomerInfo verifyUserInfo(String userName, String password) {
    //     VerifyCustomerInfo verifyCustomerInfo = new VerifyCustomerInfo();
        
    //     //verify user name exists by comparing input value to hard coded value
    //     try {
    //         if (!((userName.equals(this.firstUserName)) || (userName.equals(this.secondUserName)))) { //to check if user name doesn't exists
    //             System.out.println("User Name is incorrect or doesn't exist in our System");
    //         } else { //if user name exists
    //             verifyCustomerInfo.isUserExists = true;

    //             //check if user name has a matching password
    //             if (((userName.equals(verifyCustomerInfo.firstUserName)) && (password.equals(verifyCustomerInfo.firstUserPassword)))
    //                     || (userName.equals(verifyCustomerInfo.secondUserName) && (password.equals(verifyCustomerInfo.secondUserPassword)))) {
    //                 verifyCustomerInfo.isMatchingUserNameAndPassword = true;

    //             } else {
    //                 System.out.println("User Name and password didn't match our records. Please try again with valid credentials");
    //             }

    //         }


    //     }
    //     catch (Exception ex){
    //         System.out.println(ex);

    //     }
    //     return verifyCustomerInfo;
    // }


    public VerificationStatus userExists(String userName, String password) {
        VerificationStatus verificationStatus = new VerificationStatus();
        
        for( int i=0; i< users.length; i++){

            if(userName.equals(users[i].getUserName())){
                // message = "user found";
                if(password.equals(users[i].getPassword())){
                    verificationStatus.message = "user Found";
                    verificationStatus.status = true;
                    break;
                }
                else{
                    verificationStatus.message = "Incorrect Password";
                }
            }
            else {
                verificationStatus.message = "User not Found";
                verificationStatus.status = false;
            }
        }
        
        return verificationStatus;

        // //verify user name exists by comparing input value to hard coded value
        // try {
        //     if (!((userName.equals(this.firstUserName)) || (userName.equals(this.secondUserName)))) { //to check if user name doesn't exists
        //         System.out.println("User Name is incorrect or doesn't exist in our System");
        //     } else { //if user name exists
        //         verifyCustomerInfo.isUserExists = true;

        //         //check if user name has a matching password
        //         if (((userName.equals(verifyCustomerInfo.firstUserName)) && (password.equals(verifyCustomerInfo.firstUserPassword)))
        //                 || (userName.equals(verifyCustomerInfo.secondUserName) && (password.equals(verifyCustomerInfo.secondUserPassword)))) {
        //             verifyCustomerInfo.isMatchingUserNameAndPassword = true;

        //         } else {
        //             System.out.println("User Name and password didn't match our records. Please try again with valid credentials");
        //         }

        //     }


        // }
        // catch (Exception ex){
        //     System.out.println(ex);

        // }
        // return verifyCustomerInfo;
    }

}
