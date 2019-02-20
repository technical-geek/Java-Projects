public class Restraunt {

    String[] dishes = {
            "Dish 1",
            "Dish 2",
            "Dish 3"
    };


    String FinalDish = "This is your dish";


    int numberOfOrders;

    // private public protected

    public boolean giveOrder(String nameOfDish, boolean shouldItBeSpicy) {
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

}
