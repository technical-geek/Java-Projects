package StudentInfo;

public class Student {
    private String studentName;
    private int[] studentMarks;


    public Student(String studentName, int [] studentMarks){
        this.studentName = studentName;
        this.studentMarks = studentMarks;


    }

    public String getStudentName(){
        return this.studentName;
    }
    public int[] getStudentMarks(){
        return this.studentMarks;
    }


}
