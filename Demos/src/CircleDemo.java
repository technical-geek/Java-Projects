public class CircleDemo {
    public static void main(String args[]){
        Circle c1 = new Circle(3.0,4.0, 5.5);
        Circle c2 = new Circle(c1);
        System.out.println (c1.x);
        System.out.println ("circumference is "+c1.cirumference());
        System.out.println ("area is "+c1.area());
        System.out.println ("circumference2 is "+c2.cirumference());
        System.out.println ("area2 is "+c2.area());

    }
}
