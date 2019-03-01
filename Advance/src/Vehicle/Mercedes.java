package Vehicle;

public class Mercedes extends Car{

   public Mercedes(int doorCount,String color,String name){
       super(doorCount,color,name);           // for the parent class Car // overriding the constructor of parent class
   }

   public Mercedes(){}

//    @Override
    public void drive(){            // overriding the method of parent class
        System.out.println("Hello");
    }

    public void printProtectedData(){
       System.out.println(protectedData);
    }

    private void mercedesFunction(){ }

}
