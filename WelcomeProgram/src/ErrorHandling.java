public class ErrorHandling {

    void testingErrors(){

        Variables variables = new Variables();
        System.out.println(variables.value1);

    try{
        String[] a = new String[5];
        System.out.println(a[10]);
      //  System.out.println(1/0);
    }
    catch (Exception ex){
        System.out.println(ex);
    }





//        System.out.println("I am here");


        // -> ArrayOutoFIndexException


    }



//    int getStudentMarks(String subject){
//        int marks = 0;
//        // -> host:port/getmarks-of-subject
//        //{
//        // marks = response
//        // }
//
//        return marks;
//    }
}
