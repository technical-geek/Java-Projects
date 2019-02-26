import CustomerOrders.CustomerOrderDetails;
import CustomerProfile.CustomerInfo;
import VerifyCustomerInfo.VerifyCustomerInfo;

import java.util.Scanner;

public class WelcomeToProgrammming {


    public static void main (String[] args){

        CustomerInfo customerInfo = new CustomerInfo();

        //set and get user input user name and password
        CustomerInfo customerDetails =  customerInfo.userInputDetails();
        VerifyCustomerInfo verifyCustomerInfo = new VerifyCustomerInfo();

        //verify is user name exists and matches with password in records
        VerifyCustomerInfo verifyCustomerDataExists = verifyCustomerInfo.
                verifyUserInfo(customerInfo.userInputName, customerInfo.userInputPassword);

        // if user name and password matched, then get status of that user
        if ((verifyCustomerDataExists.isUserExists) && (verifyCustomerDataExists.isMatchingUserNameAndPassword)){
            CustomerOrderDetails customerOrderDetails = new CustomerOrderDetails();
            customerOrderDetails.orderStatus(customerInfo.userInputName);

        }





    }


    static void calcOperatorFunction(){
        int x = 8, y=5, z=10;
        Calculator calculator = new Calculator();
        Operators operators = new Operators();

        //Calculator program
        System.out.println ("addition is " + calculator.add(x,y));
        System.out.println ("subtraction is " + calculator.sub(x,y));
        System.out.println ("multiplication is " + calculator.mul (x,y));
        System.out.println ("division is " + calculator.div(x,y));
        System.out.println ("modulus division is " + calculator.mod(x,y));

        System.out.println("\n=========================================================\n");


        //logical operators
        System.out.println("x: " + x + " y: " +y+ " || x is greater than y? " + operators.greaterThanOperator(x,y));
        System.out.println("x: " + x + " y: " +y+ " || x is less than y? " + operators.lessThanOperator(x,y));
        System.out.println("x: " + x + " y: " +y+ " || x is equal to y? " + operators.equalToOperator(x,y));
        System.out.println("x: " + x + " y: " +y+ " || x is not equal to y? " + operators.notEqualOperator(x,y));
        System.out.println("x: " + x + " y: " +y+ " z: " +z+ " || x is greater than  y and z? " + operators.logicalAndOperator(x,y,z));
        System.out.println("x: " + x + " y: " +y+ " z: " +z+ " || x is greater than y or z? " + operators.logicalOrOperator(x,y,z));
        System.out.println("x: " + x + " y: " +y+ " z: " +z+ " || x is between y and z? " + operators.logicalNotOperator(x,y,z));


        // customer and restaurant program
        Customer customer = new Customer();
        Restraunt restaurant = new Restraunt();
        restaurant.restaurantMenu();
        String customerOrder = customer.customerOrder();

        if (restaurant.checkingAvailability(customerOrder)){
            int numberOfOrders = customer.numberOfOrders();
            int spiceLevel = customer.spiceLevel();
            int timeTaken = restaurant.timeTakenToPreapare(customerOrder,numberOfOrders);
            if (timeTaken !=0){
                System.out.println("Would you like to confirm your order? \n Please type YES or NO");
                try {
                    Scanner scanner = new Scanner(System.in);
                    String customerResponse  = scanner.nextLine();
                    if (customerResponse.equals("YES")){
                        restaurant.orderSentToKitchen(customerOrder);       // Comment -> try to name orderSentToKitchen to sendOrderToKitchen "just making it more sensible to use".
                    }
                    else {
                        System.out.println("Sorry we couldn't server you today. ");
                    }

                }
                catch (Exception ex){
                    System.out.println(ex);
                    System.out.println("Please enter a string value.");
                }

            }
        }



        //Variables.value8 = 3.14;


        // -> NullPointerException
//        ErrorHandling errorHandling = new ErrorHandling();
//        errorHandling.testingErrors();

//        try{
//            errorHandling.testingErrors(); // null out of bound
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//            System.out.println("Error occurred");
//
//        } finally {
//            System.out.println("Testing Finished");
//
//        }
//        Variables variables = new Variables();
//        variables.printAttributes();

//        Restraunt restraunt = new Restraunt();
//        boolean result = restraunt.giveOrder("Dish 1",false);
//        System.out.println(result);
//


//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
////        System.out.println(myObj);
//        String userName = myObj.nextLine();
//        System.out.println("Got the input");
//        System.out.println(userName);
    }
    static void printArray (){
        int num [] = {2,3,4,5,6,7,8,1,6};
        for (int i =0; i<num.length;i++){
            System.out.println(num[i]);

        }
    }
}
