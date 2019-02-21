import java.util.Scanner;

public class Customer {
    String customerOrder;
    int numberOfOrdersToBePlaced;
    int spiceLevel;



    public String customerOrder (){
        System.out.println("What would you like to order today? Enter below: \n");
        try {
            Scanner scanner = new Scanner(System.in);
            customerOrder = scanner.nextLine();

        }
        catch (Exception ex){
         System.out.println(ex);
         System.out.println("Please enter a string value.");
        }

        return customerOrder;
    }

    public int numberOfOrders () {
        System.out.println("How many of orders would you like to order ? Enter below: \n");
        try {
            Scanner scanner = new Scanner(System.in);
            numberOfOrdersToBePlaced = scanner.nextInt();

        }
        catch (Exception ex){
            System.out.println(ex);
            System.out.println("Please enter a string value.");
        }
        return  numberOfOrdersToBePlaced;

    }

    public int spiceLevel () {
        System.out.println("What will be your preferred spice level on a scale of 1 to 10 \n");
        try {
            Scanner scanner = new Scanner(System.in);
            spiceLevel = scanner.nextInt();

        }
        catch (Exception ex){
            System.out.println(ex);
            System.out.println("Please enter a string value.");
        }
        return  spiceLevel;

    }
}
