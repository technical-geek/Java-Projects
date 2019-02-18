public class Operators {

    public boolean equalToOperator (int a, int b){
        return a == b;
    }

    public boolean greaterThanOperator (int a, int b) {
        return a > b;
    }

    public boolean lessThanOperator (int a, int b){
        return a < b;
    }

    public  boolean notEqualOperator (int a, int b){
        return a != b;
    }

    public boolean logicalAndOperator (int a, int b, int c){
        return  a > b && a > c;
    }

    public  boolean logicalOrOperator (int a, int b, int c){
        return  a > b || a > c;
    }

    public  boolean logicalNotOperator  (int a, int b, int c){
        return !(a < b && a < c);
    }
}
