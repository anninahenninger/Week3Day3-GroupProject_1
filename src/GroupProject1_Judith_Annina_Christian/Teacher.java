package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;

public class Teacher {
    private String teacherName;
    private Subject[]subject;

    public Teacher(String teacherName, Subject[]subject){
        this.teacherName= teacherName;
        this.subject = subject;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void getTeacherName(){
        this.teacherName=teacherName;
    }

    public void setSubject(Subject[]subject) {
        this.subject = subject;
    }

    public void getSubject(){
        this.subject = subject;
    }
}
