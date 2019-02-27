package Order;

import CustomerOrders.CustomerOrderDetails;

import java.util.Scanner;

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
    public String getAddressOfUser(){
        return this.addressOfUser;
    }
    public  String getOrderItem() {
        return this.orderItem;
    }
    public  String getOrderStatus() {
        return this.orderStatus;
    }


}