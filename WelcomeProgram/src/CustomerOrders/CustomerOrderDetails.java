package CustomerOrders;
import Order.Order;
import VerifyCustomerInfo.VerifyCustomerInfo;
import VerifyCustomerInfo.VerificationStatus;

import java.util.Scanner;

public class CustomerOrderDetails {


    Order order1 = new Order("Max","SFO","Mobile Phone","delivered");
    Order order2 = new Order("Tim","San Jose","Electric Lamp","out for delivery");
    Order order3 = new Order("Sam","Santa Clara","Mobile Phone","delivered");

    Order[] orders = { order1, order2, order3 };



    public Order getOrderForUser(String username, String password){
        Order returnOrder = new Order();

        VerifyCustomerInfo verifyCustomerInfo = new VerifyCustomerInfo();
        VerificationStatus verificationStatus =  verifyCustomerInfo.userExists(username,password);
        if(verificationStatus.status == true){
            for(int i = 0; i < orders.length ; i++ ){
                if(username.equals(orders[i].getUserName())){
                    returnOrder = orders[i];
                }
            }
        }
        else {
            System.out.println(verificationStatus.message);
            returnOrder = null;
        }
        return returnOrder;
    }

    public void getOrder(){
        String username, password;

        System.out.println("Enter Your User Name");
        Scanner scannerUserName = new Scanner(System.in);
        username = scannerUserName.nextLine();

        System.out.println("Enter Your Password");
        Scanner scannerPassword = new Scanner(System.in);
        password = scannerPassword.nextLine();

        CustomerOrderDetails customerOrderDetails = new CustomerOrderDetails();
        Order order = customerOrderDetails.getOrderForUser(username,password);
        if(order!=null){
            System.out.println("Welcome " + order.getUserName() + "!\nYou have ordered " +   order.getOrderItem()
                    + "\nYour order Status is " + "\"" + order.getOrderStatus() +"\""
                    + "\nDelivery location is " + order.getAddressOfUser());
        }


    }
}



