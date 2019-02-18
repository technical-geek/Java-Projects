public class Circle {
    double x,y,r;
    Circle (double a, double b, double c){
        this.x = a; this.y= b; this.r = c;
    }
    Circle(Circle c){
        x= c.x; y= c.y; r= c.r;
    }
    double cirumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }
}
