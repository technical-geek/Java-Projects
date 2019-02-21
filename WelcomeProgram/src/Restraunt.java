public class Restraunt {


    public String [] restaurantMenu = {"Dish 1","Dish 1","Dish 2","Dish 3","Dish 4",
            "Dish 5","Dish 6","Dish 7","Dish 8","Dish 9","Dish 10"};
    public void restaurantMenu (){
        System.out.println("Restaurant Menu:\n--------------");

        for (int i=1; i<=10;i++)            // Comment -> why are you looping using 10 as limit , you should have used restaurantMenu's length

            System.out.println(i + ". " + restaurantMenu[i]);
    }
    private String[] dishesAvailableToday = {
            "Dish 1",
            "Dish 2",
            "Dish 3"
    };

    private int [] totalNumberOfOrderAvailable = {10, 5, 3};
    private boolean isFoodPrepared;
    private String customerOrder;
    final private int minimumOneOrderTime = 5;


    public boolean checkingAvailability (String customerOrder){
        boolean orderedItemAvailableToPrepare = false;
        boolean orderedItemAvailableInMenu = false;
        boolean canPrepareOrderedItem = false;
        //check ordered item is in menu or not
        for (int i =0; i< restaurantMenu.length; i++){
            if (restaurantMenu[i].equals(customerOrder)){
                orderedItemAvailableInMenu = true;      //Comment -> exit the loop when result is found using break
            }
        }
        if (orderedItemAvailableInMenu) {//if order is available in menu then check if customer order is available in Kitchen menu
            for (int i = 0; i < dishesAvailableToday.length; i++) {
                if (dishesAvailableToday[i].equals(customerOrder)) {//check if ordered item is available in kitchen today

                    orderedItemAvailableToPrepare = true;
                    canPrepareOrderedItem = true;
                    break;

                }

            }
            if (!orderedItemAvailableToPrepare) {
                System.out.println("Sorry we don't have that item available in kitchen today");

            }
        }
        else {
            System.out.println("Sorry we don't have that item in our menu");

        }
        return canPrepareOrderedItem;

    }
    public int timeTakenToPreapare (String customerOrder, int numberOfOrders){
        int timeTaken = 0;
        for (int i = 0; i < dishesAvailableToday.length; i++) {
            if (dishesAvailableToday[i].equals(customerOrder)) {
                for (int j =i; j< totalNumberOfOrderAvailable.length; j++){

                    if (numberOfOrders < totalNumberOfOrderAvailable[j]){
                          timeTaken = minimumOneOrderTime*numberOfOrders;

                        System.out.println("It would take " + timeTaken + " minutes to prepare your order\n");
                        break;
                    }
                    else {
                        System.out.println("Sorry we can only take a maximum of " +totalNumberOfOrderAvailable[j]+ " orders right now.");
                    }

                }
                break;


            }
        }
        return timeTaken;


    }

    public void orderSentToKitchen (String customerOrder){
        System.out.println("Order sent to kitchen\n");
        this.customerOrder = customerOrder;
        if (preparingFood(customerOrder)){
            readyToDevliver(customerOrder);
        }

    }

    private boolean preparingFood (String customerOrder) {
        System.out.println("Preparing your food " +customerOrder +"\n");
        return true;

    }

    private  boolean readyToDevliver (String customerOrder) {
        System.out.println("Your order " +customerOrder+" is prepared and is out for delivery");
        return true;

    }

    // private public protected

 /*   public boolean giveOrder(String nameOfDish, boolean shouldItBeSpicy) {
        boolean isDishFound = false;

        for(int i=0; i< dishes.length; i++){
            if(dishes[i].equals(nameOfDish)){
                isDishFound = true;
                System.out.println("Found the dish");
                break;
            }
            else{
                System.out.println("No found the dish");
            }
        }

        sendItToKitchen(nameOfDish, shouldItBeSpicy);
        return isDishFound;
    }

    private void sendItToKitchen(String nameOfDish, boolean shouldItBeSpicy) {

    }

    private void deliverOrder(String nameOfDishToBeDelivered) {
        System.out.println(nameOfDishToBeDelivered);
    }
    */

}
