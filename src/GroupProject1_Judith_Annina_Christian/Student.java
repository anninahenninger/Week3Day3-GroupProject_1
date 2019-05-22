package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    enum Classroom {A1, A2, A3, A4, B1, B2}
    private String name;
    private int age;
    private Classroom aClassroom;
    private String[][][] schedule;
    private HashMap<String, Integer> points;
    private String email;
    private String mommy;
    private String daddy;
    private HashMap<String, String> grades;
    private String avgGrade = "";

    public Student(String name, int age, Classroom aClassroom, String[][][] schedule, HashMap<String, Integer> points,
                   String email, String mommy, String daddy){
        this.name = name;
        this.age = age;
        this.aClassroom = aClassroom;
        this.schedule = schedule;
        this.points = points;
        this.email = email;
        this.mommy = mommy;
        this.daddy = daddy;
        this.grades = new HashMap<>();
        this.avgGrade = setAvgGrade();
    }

    public void printSchedule(){
        int counter = 7;
        System.out.printf("%9s" + "%15s" + "%15s" + "%15s" + "%15s%n", "MON", "TUE", "WED", "THU", "FRI");
        for (String[][] hour : this.schedule) {
            for (String[] day : hour) {
                if(counter < 11) {
                    counter++;
                    System.out.printf("%02d"  + ":00 ", counter);
                }else{
                    counter = 8;
                    System.out.printf("%02d"  + ":00 ", counter);
                }
                for (String subject : day) {
                    System.out.printf("%-15s", subject);
                    }
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
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

