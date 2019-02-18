public class WelcomeToProgrammming {
    public static void main (String[] args){
        //printArray();
        Variables variables = new Variables();
        variables.printAttributes();
        Variables.value8 = 3.14;


    }
    static void printArray (){
        int num [] = {2,3,4,5,6,7,8,1,6};
        for (int i =0; i<num.length;i++){
            System.out.println(num[i]);

        }
    }
}
