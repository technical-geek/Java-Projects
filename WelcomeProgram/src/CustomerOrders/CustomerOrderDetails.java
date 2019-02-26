package CustomerOrders;

public class CustomerOrderDetails {
    /*private String orderStatus1 = "Your order of mobile phone is out for delivery";
    private String orderStatus2 = "Your order of mobile phone screen protector is delivered";
    private String orderStatus3 = "Your order of Shoes is in transit";
    private String orderStatus4 = "Your order of Headphones is ready for shipping";
    */

    private String [] orderStatus =  {"out for delivery", "delivered", "in transit", "order received"};
    private String [] orderedItem = {"Mobile Phone", "Laptop", "Electric Lamp", "Screen Protector", "Books", "Gaming Console"};
    private String firstUserName = "Max";
    private String secondUserName = "Tim";
    private int userOrderLimit, orderStatusLimit, orderItemLimit;


    public void orderStatus (String customerUserName){
        System.out.println("See your order status below");
        System.out.println("===========================================================");

        //for now hard code number items a user has in cart
        if (customerUserName.equals(firstUserName)){
          userOrderLimit = 2;

        }
        else  if (customerUserName.equals(secondUserName)){
            userOrderLimit = 3;
        }
        //provide customer name and  check order status
        for (int i=0; i <= userOrderLimit; i++){
            orderStatusLimit = (int)((Math.random())*4); //get a random value and pass it to array to return a different status and item each time program is run
            orderItemLimit = (int)((Math.random())*6);
            System.out.println(i + ". Your order status for " +orderedItem[orderItemLimit]+ " is " + orderStatus[orderStatusLimit]);

        }



    }
}
