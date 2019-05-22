package GroupProject1_Judith_Annina_Christian;


import java.util.ArrayList;

public class Classroom {

    private String classNumber;
    private ArrayList<Student>student;

    public Classroom (String classNumber, ArrayList<Student>student){
        this.classNumber=classNumber;
        this.student=student;
    }

    public void getStudent(){
        this.student=student;
    }
    public void getClassNumber(){
        this.classNumber=classNumber;
    }
}
