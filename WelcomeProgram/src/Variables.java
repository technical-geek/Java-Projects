public class Variables {
    //these are attributes
    String value1 = "Chaitanya";
    int value2 = -1;
    float value3 = 1;
    boolean value4 = true;
    char value5 = 'C';
    byte value6 =127;
    long value7;
    static double value8;
    int [] marks = {67,86,45,67};
    int [] marks2 = new int[10];

    //method
    void printAttributes (){
        System.out.println(value1.length());
        ++value2;
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        marks2[0] = 1;
        marks2[1] = 100;
        System.out.println(marks2.length);
    }
}
