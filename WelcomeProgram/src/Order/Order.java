package Order;

public class Order{
    private String userName;
    private String addressOfUser;
    private String orderItem;
    private String orderStatus;

    public Order(){

    }
    public Order(String userName,  String addressOfUser,  String orderItem, String orderStatus){
        this.userName = userName;
        this.addressOfUser = addressOfUser;
        this.orderItem = orderItem;
        this.orderStatus = orderStatus;
    }

    public String getUserName(){
        return this.userName;
    }
    

    // public Order getOrder(){
    //     return this;
    // }
}