package VerifyCustomerInfo;

import UserData.User;
public class VerifyCustomerInfo {

    private User user1 = new User("Max","abc123");
    private User user2 = new User("Tim", "def123");
    private User user3 = new User("Sam", "ssf123");
    
    private User[] users = { user1, user2, user3 };




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
                    verificationStatus.status = false;
                    break;
                }
            }
            else {
                verificationStatus.message = "User not Found";
                verificationStatus.status = false;
                break;
            }
        }
        
        return verificationStatus;


    }

}
