package Vehicle;

public class Car {
    private int doorCount;
    private int tyreCount = 4;
    private String color = "black";
    public String transmissionType;
    public float horsePower = 5000;
    private String name;
    protected String protectedData = "#@()NF(*$HNV(";

    public Car(int doorCount,String color,String name ){
        this.doorCount = doorCount;
        this.color = color;
        this.name = name;
    }

    public Car(){}

    public void drive(){
        System.out.println(this.name + " is being driven");
    }

    public void increaseSpeed(){

    }

    public void stop(){

    }

    public void start(){

    }

    public void printDetails(){
        System.out.println(doorCount + "\n" + tyreCount + "\n" + color);
    }
}
