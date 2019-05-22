package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    enum Classroom {A1, A2, A3, A4, B1, B2}
    private String name;
    private int age;
    private Classroom aClassroom;
    private String[] subjects;
    private String email;
    private String mommy;
    private String daddy;
    private HashMap<String, String> grades;
    private HashMap<String, Integer> points;
    private String avgGrade;

    public Student(String name, int age, Classroom aClassroom, String[] subjects, String email, String mommy, String daddy){
        this.name = name;
        this.age = age;
        this.aClassroom = aClassroom;
        this.subjects = subjects;
        this.email = email;
        this.mommy = mommy;
        this.daddy = daddy;
        this.grades = new HashMap<>();
        this.avgGrade = setAvgGrade();
    }
    public Student(HashMap<String, Integer> points){
        this.points = points;
    }
    private void setGrade(){
        String actGrade = "";
        for(Map.Entry<String, Integer> entry : points.entrySet()) {
            if (entry.getValue() > 90) {
                actGrade = "A";
            }
            if (entry.getValue() > 80) {
                actGrade = "B";
            }
            if (entry.getValue() > 90) {
                actGrade = "C";
            }
            if (entry.getValue() > 70) {
                actGrade = "D";
            }
            if (entry.getValue() > 60) {
                actGrade = "E";
            }
            if (entry.getValue() > 50) {
                actGrade = "F";
            }
            grades.put(entry.getKey(), actGrade);
        }
    }
    public String setAvgGrade() {
        int totalPts = 0;
        int avgPts = 0;
        String actGrade = "";
        for (Map.Entry<String, Integer> entry : points.entrySet()) {
            totalPts += entry.getValue();
            avgPts = avgPts / points.size();
            if (avgPts > 90) {
                actGrade = "A";
            }
            if (entry.getValue() > 80) {
                actGrade = "B";
            }
            if (entry.getValue() > 90) {
                actGrade = "C";
            }
            if (entry.getValue() > 70) {
                actGrade = "D";
            }
            if (entry.getValue() > 60) {
                actGrade = "E";
            }
            if (entry.getValue() > 50) {
                actGrade = "F";
            }
        }
        return actGrade;
    }
}

