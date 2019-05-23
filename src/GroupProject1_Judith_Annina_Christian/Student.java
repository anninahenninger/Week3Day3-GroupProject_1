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
                   String email, String mommy, String daddy) {
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

    public void printSchedule() {
        int counter = 7;
        System.out.printf("%9s" + "%15s" + "%15s" + "%15s" + "%15s%n", "MON", "TUE", "WED", "THU", "FRI");
        for (String[][] hour : this.schedule) {
            for (String[] day : hour) {
                if (counter < 11) {
                    counter++;
                    System.out.printf("%02d" + ":00 ", counter);
                } else {
                    counter = 8;
                    System.out.printf("%02d" + ":00 ", counter);
                }
                for (String subject : day) {
                    System.out.printf("%-15s", subject);
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
    }

    private void setGrade_1st() {
        String actGrade = "";
        for (Map.Entry<String, Integer> entry : points_1st.entrySet()) {
            if ((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
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
                } else if (entry.getValue() <= 50) {
                    actGrade = "F";
                }
                grades_1st.put(entry.getKey(), actGrade);
            } else if (entry.getValue() == 1) {
                actGrade = "very good";
            } else if (entry.getValue() == 2) {
                actGrade = "well done";
            } else if (entry.getValue() == 3) {
                actGrade = "successful";
            } else if (entry.getValue() == 4) {
                actGrade = "not successful";
            }
            grades_1st.put(entry.getKey(), actGrade);
        }
    }

    private void setGrade_2nd() {
        String actGrade = "";
        for (Map.Entry<String, Integer> entry : points_2nd.entrySet()) {
            String key = entry.getKey();
            Integer sumPoints = entry.getValue() + points_1st.get(key);
            sumPoints /= 2;
            if ((entry.getKey() != "Art") && (entry.getKey() != "PhyEdu")) {
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
                } else if (sumPoints <= 50) {
                    actGrade = "F";
                }

            } else if (sumPoints == 1) {
                actGrade = "very good";
            } else if (sumPoints == 2) {
                actGrade = "well done";
            } else if (sumPoints == 3) {
                actGrade = "successful";
            } else if (sumPoints == 4) {
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
        } else if (avgPts > 80) {
            actGrade = "B";
        } else if (avgPts > 70) {
            actGrade = "C";
        } else if (avgPts > 60) {
            actGrade = "D";
        } else if (avgPts > 50) {
            actGrade = "E";
        } else if (avgPts <= 50) {
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
        } else if (avgPts > 80) {
            actGrade = "B";
        } else if (avgPts > 70) {
            actGrade = "C";
        } else if (avgPts > 60) {
            actGrade = "D";
        } else if (avgPts > 50) {
            actGrade = "E";
        } else if (avgPts <= 50) {
            actGrade = "F";
        }
        return actGrade;
    }

    public void setPoints_2nd(HashMap<String, Integer> points_2nd) {
        this.points_2nd = points_2nd;
        setGrade_2nd();
        this.avgGrade_2nd = setAvgGrade_2nd();
    }

    public void printReport(int semester) {
        System.out.println();
        System.out.println(" Semester Report for " + this.name + ":");
        System.out.println("***************************");
        System.out.println();
        if (semester == 1) {
            for (Map.Entry<String, String> entry : grades_1st.entrySet()) {
                System.out.printf("%-15S" + "%-15S%n", entry.getKey(), entry.getValue());
                System.out.println("_________________________");
            }
        } else if (semester == 2) {
            for (Map.Entry<String, String> entry : grades_2nd.entrySet()) {
                System.out.printf("%-15S" + "|%-15S%n", entry.getKey(), entry.getValue());
                System.out.println("__________________________");
            }
        } else
            System.out.println("There are only 2 semesters!!! Input is only 1 or 2.");
    }

    public void printAvgGradeOfSemester(int semester) {

        System.out.println();
        if (semester == 1) {
            System.out.println("Average grade of semester " + semester + " is " + avgGrade_1st + ". ");
        } else if (semester == 2) {
            System.out.println("AVERAGE GRADE OF YEAR IS " + avgGrade_2nd + ". ");
        }
    }

    public void checkIfLoser(ArrayList<Teacher> teachers) {
        boolean isLoser = false;
        int fCounter = 0;
        int aCounter = 1;

        for (Map.Entry<String, String> entry : this.grades_2nd.entrySet()) {
            if (entry.getValue().equals("F")) {
                isLoser = true;
                fCounter++;
            }
        }
        if (isLoser) {
            System.out.printf("Dear Parents,\nIt is your fault, you lazy, miserable people, " + "%S" + " and "
                    + "%S" + ": why didn’t you spend\nyour afternoons and weekends teaching your kid " +
                    "%S" + " following subjects: ", daddy, mommy, name);

            for (Map.Entry<String, String> entry : this.grades_2nd.entrySet()) {
                if (entry.getValue().equals("F") && (fCounter > aCounter)) {
                    aCounter++;
                    System.out.printf("%S" + ", ", entry.getKey());
                } else if (entry.getValue().equals("F")) {
                    System.out.printf("and " + "%S" + " ", entry.getKey());
                }
            }
            System.out.print("where he\nhas gotten an F?\n" + "That was YOUR job - we provided you with books and locked " +
                    "your kid for 4 hours a day, so\nyou can earn money to spend it on the afternoon teachers. " +
                    "Why didn’t you do your job on time?\nShame. Shame. Shame: \n" +
                    "(oh, yeah, btw, here is a contact list of institutions and people that can provide you" +
                    " with\nextra help - maybe some of our fellow teachers works there, maybe not):\n");

            for (Map.Entry<String, String> entry : this.grades_2nd.entrySet()) {
                String[] subjects = new String[3];
                if (entry.getValue().equals("F")) {
                    System.out.printf("For " + "%S" + ":\n", entry.getKey());
                    for (int i = 0; i < teachers.size(); i++) {
                        for (int j = 0; j < teachers.get(i).getSubject().length; j++) {
                            subjects[j] = teachers.get(i).getSubject()[j];
                            if (entry.getKey() == subjects[j]) {
                                System.out.println(teachers.get(i).getTeacherName());
                            }
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println("In the name of your beloved First Elite School “We Are Proud That We Treat All " +
                    "Students Equal”,\n" +
                    "Sincerely Yours,   \n" +
                    "Dr Dipl.Kfm. Max von und zu Mustermann,\n" +
                    "Director of School");
        }
    }
}

