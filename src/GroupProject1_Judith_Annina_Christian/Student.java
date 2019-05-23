package GroupProject1_Judith_Annina_Christian;

import java.util.HashMap;
import java.util.Map;

public class Student {
    enum Classroom {A1, A2, A3, A4, B1, B2}
    private String name;
    private int age;
    private Classroom aClassroom;
    private String[][][] schedule;
    private HashMap<String, Integer> points_1st;
    private HashMap<String, Integer> points_2nd;
    private String email;
    private String mommy;
    private String daddy;
    private HashMap<String, String> grades_1st;
    private HashMap<String, String> grades_2nd;
    private String avgGrade_1st = "";
    private String avgGrade_2nd = "";

    public Student(String name, int age, Classroom aClassroom, String[][][] schedule, HashMap<String, Integer> points_1st,
                   String email, String mommy, String daddy){
        this.name = name;
        this.age = age;
        this.aClassroom = aClassroom;
        this.schedule = schedule;
        this.points_1st = points_1st;
        this.email = email;
        this.mommy = mommy;
        this.daddy = daddy;
        this.grades_1st = new HashMap<>();
        setGrade_1st();
        this.points_2nd = new HashMap<>();
        this.grades_2nd = new HashMap<>();
        setGrade_2nd();
        this.avgGrade_1st = setAvgGrade_1st();
        this.avgGrade_2nd = setAvgGrade_2nd();
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

    private void setGrade_1st(){
        String actGrade = "";
        for(Map.Entry<String, Integer> entry : points_1st.entrySet()) {
            if((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
                if (entry.getValue() > 90) {
                    actGrade = "A";
                } else if (entry.getValue() > 80) {
                    actGrade = "B";
                } else if (entry.getValue() > 70) {
                    actGrade = "C";
                } else if (entry.getValue() > 60) {
                    actGrade = "D";
                } else if (entry.getValue() > 50) {
                    actGrade = "E";
                } else if (entry.getValue() < 50) {
                    actGrade = "F";
                }
                grades_1st.put(entry.getKey(), actGrade);
            }else if(entry.getValue() == 1){
                actGrade = "very good";
            }else if(entry.getValue() == 2){
                actGrade = "well done";
            }else if(entry.getValue() == 3){
                actGrade = "successful";
            }else if(entry.getValue() == 4){
                actGrade = "not successful";
            }
            grades_1st.put(entry.getKey(), actGrade);
        }
    }
    private void setGrade_2nd(){
        String actGrade = "";
        for(Map.Entry<String, Integer> entry : points_2nd.entrySet()) {
            String key = entry.getKey();
            Integer sumPoints = entry.getValue() + points_1st.get(key);
            sumPoints /= 2;
            if((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
                if (sumPoints > 90) {
                    actGrade = "A";
                } else if (sumPoints > 80) {
                    actGrade = "B";
                } else if (sumPoints > 70) {
                    actGrade = "C";
                } else if (sumPoints > 60) {
                    actGrade = "D";
                } else if (sumPoints > 50) {
                    actGrade = "E";
                } else if (sumPoints < 50) {
                    actGrade = "F";
                }

            }else if(sumPoints == 1){
                actGrade = "very good";
            }else if(sumPoints == 2){
                actGrade = "well done";
            }else if(sumPoints == 3){
                actGrade = "successful";
            }else if(sumPoints == 4){
                actGrade = "not successful";
            }
            grades_2nd.put(entry.getKey(), actGrade);
        }
    }

    public String setAvgGrade_1st() {
        int avgPts = 0;
        String actGrade = "";
        Integer allPoints = 0;
        for (Map.Entry<String, Integer> entry : this.points_1st.entrySet()) {
            if ((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
                allPoints += entry.getValue();
            }
        }

        avgPts = allPoints / (this.points_1st.size() - 2);
        if (avgPts > 90) {
                actGrade = "A";
            }else if (avgPts > 80) {
                actGrade = "B";
            }else if (avgPts > 70) {
                actGrade = "C";
            }else if (avgPts > 60) {
                actGrade = "D";
            }else if (avgPts > 50) {
                actGrade = "E";
            }else if (avgPts < 50) {
                actGrade = "F";
            }
        return actGrade;
    }
    public String setAvgGrade_2nd() {
        int avgPts = 0;
        String actGrade = "";
        Integer allPoints = 0;
        for (Map.Entry<String, Integer> entry : points_2nd.entrySet()) {
            if ((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
                String key = entry.getKey();
                allPoints += entry.getValue() + points_1st.get(key);

            }
        }
        avgPts = allPoints / (points_2nd.size() - 2) / 2;
        if (avgPts > 90) {
            actGrade = "A";
        }else if (avgPts > 80) {
            actGrade = "B";
        }else if (avgPts > 70) {
            actGrade = "C";
        }else if (avgPts > 60) {
            actGrade = "D";
        }else if (avgPts > 50) {
            actGrade = "E";
        }else if (avgPts < 50) {
            actGrade = "F";
        }
        return actGrade;
    }

    public void setPoints_2nd(HashMap<String, Integer> points_2nd){
        this.points_2nd = points_2nd;
        setGrade_2nd();
        this.avgGrade_2nd = setAvgGrade_2nd();
    }
    public void printReport(int i){
        System.out.println();
        System.out.println(" Semester Report for "+ this.name+ ":");
        System.out.println("***************************");
        System.out.println();
        if(i == 1){
            for (Map.Entry<String, String> entry : grades_1st.entrySet()) {
                System.out.printf("%-15S" + "%-15S%n", entry.getKey(), entry.getValue());
                System.out.println("_________________________");
            }
        }else if(i == 2){
            for (Map.Entry<String, String> entry : grades_2nd.entrySet()) {
                System.out.printf("%-15S" + "|%-15S%n", entry.getKey(), entry.getValue());
                System.out.println("__________________________");
            }
        }else
            System.out.println("There are only 2 semesters!!! Input is only 1 or 2.");
    }
    public void printAvgGradeOfSemester(int i) {

        System.out.println();
        if (i == 1) {
            System.out.println("Average grade of semester " + i + " is " + avgGrade_1st+". ");
        } else if (i == 2) {
            System.out.println("AVERAGE GRADE OF SEMESTER " + i + " IS " + avgGrade_2nd+ ". ");
        }

    }
}

