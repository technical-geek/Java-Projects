package VerifyCustomerInfo;

import CustomerProfile.CustomerInfo;

public class VerifyCustomerInfo {


    private String firstUserName = "Max";
    private String secondUserName = "Tim";
    private String firstUserPassword = "abc123";
    private String secondUserPassword = "def123";

    public boolean isUserExists;
    public   boolean isMatchingUserNameAndPassword;


    public VerifyCustomerInfo verifyUserInfo(String userName, String password) {
        VerifyCustomerInfo verifyCustomerInfo = new VerifyCustomerInfo();
        verifyCustomerInfo.isUserExists = false;
        verifyCustomerInfo.isMatchingUserNameAndPassword = false;

        //verify user name exists by comparing input value to hard coded value
        try {
            if (!((userName.equals(firstUserName)) || (userName.equals(verifyCustomerInfo.secondUserName)))) { //to check if user name doesn't exists
                System.out.println("User Name is incorrect or doesn't exist in our System");
            } else { //if user name exists
                verifyCustomerInfo.isUserExists = true;

                //check if user name has a matching password
                if (((userName.equals(verifyCustomerInfo.firstUserName)) && (password.equals(verifyCustomerInfo.firstUserPassword)))
                        || (userName.equals(verifyCustomerInfo.secondUserName) && (password.equals(verifyCustomerInfo.secondUserPassword)))) {
                    verifyCustomerInfo.isMatchingUserNameAndPassword = true;

                } else {
                    System.out.println("User Name and password didn't match our records. Please try again with valid credentials");
                }

            }


        }
        catch (Exception ex){
            System.out.println(ex);

        }
        return verifyCustomerInfo;
    }

}
