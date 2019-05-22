package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;

public class Teacher {
    private String teacherName;
    private ArrayList<Subject>subject;

    public Teacher(String teacherName, ArrayList<Subject>subject){
        this.teacherName= teacherName;
        this.subject = subject;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void getTeacherName(){
        this.teacherName=teacherName;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public void getSubject(){
        this.subject = subject;
    }
}
