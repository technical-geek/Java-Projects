public class WelcomeToProgrammming {
    public static void main (String[] args){
        int x = 8, y=5, z=10;
        //printArray();
        Variables variables = new Variables();
        Calculator calculator = new Calculator();
        Operators operators = new Operators();
        //variables.printAttributes();

        //Calculator
        System.out.println ("addition is " + calculator.add(x,y));
        System.out.println ("subtraction is " + calculator.sub(x,y));
        System.out.println ("multiplication is " + calculator.mul (x,y));
        System.out.println ("division is " + calculator.div(x,y));
        System.out.println ("modulus division is " + calculator.mod(x,y));

        System.out.println("\n=========================================================\n");


        //logical operators
        System.out.println("x is greater than y? " + operators.greaterThanOperator(x,y));
        System.out.println("x is less than y? " + operators.lessThanOperator(x,y));
        System.out.println("x is equal to y? " + operators.equalToOperator(x,y));
        System.out.println("x is not equal to y? " + operators.notEqualOperator(x,y));
        System.out.println("x is between y and z? " + operators.logicalAndOperator(x,y,z));
        System.out.println("x is greater than y or z? " + operators.logicalOrOperator(x,y,z));
        System.out.println("x is not between y and z? " + operators.logicalNotOperator(x,y,z));



        //Variables.value8 = 3.14;


    }
    static void printArray (){
        int num [] = {2,3,4,5,6,7,8,1,6};
        for (int i =0; i<num.length;i++){
            System.out.println(num[i]);

        }
    }
}
