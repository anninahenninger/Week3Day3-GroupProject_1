package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;

public class Schedule {
    private String[][][] schedule;
    static private ArrayList<String> teachers = new ArrayList<>();

    public Schedule(String[][][] schedule){
        this.schedule= schedule;
    }

    static public void setTeachers(ArrayList<String> teacher){
        teachers = teacher;
    }

    /*public Teacher teacherAbsent(Teacher teacher, int day){
        return teacher;
    } not used */

}
