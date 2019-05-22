package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;

public class Subject {

    private String subjName;
    private ArrayList<Teacher>teacher;

    public Subject (String subjName, ArrayList<Teacher>teacher){
        this.subjName= subjName;
        this.teacher = teacher;

    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public void getSubjName(){
        this.subjName = subjName;
    }

    public void getTeacher(){
        this.teacher = teacher;
    }

    public void setTeacher(ArrayList<Teacher>teacher){
        this.teacher=teacher;
    }
}


