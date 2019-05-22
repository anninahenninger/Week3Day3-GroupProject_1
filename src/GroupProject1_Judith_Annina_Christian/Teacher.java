package GroupProject1_Judith_Annina_Christian;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher {
    private String teacherName;
    private String[] subjects;

    public Teacher(String teacherName, String[] subjects){
        this.teacherName= teacherName;
        this.subjects = subjects;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void getTeacherName(){
        this.teacherName=teacherName;
    }

    public void setSubject(String[] subjects) {
        this.subjects = subjects;
    }

    public void getSubject(){
        this.subjects = subjects;
    }
}
