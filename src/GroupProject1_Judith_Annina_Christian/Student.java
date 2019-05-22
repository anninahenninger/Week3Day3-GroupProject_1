package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private Classroom classroom;
    private ArrayList<Subject> subjects;
    private HashMap<Subject, String> grades;
    private String email;
    private String name;
    private String mommy;
    private String daddy;
    private int age;
    private String avgGrade;

    public Student(String name, int age, Classroom classroom, ArrayList<Subject> subjects, String email, String mommy,
                   String daddy){
        this.name = name;
        this.age = age;
        this.classroom = classroom;
        this.subjects = subjects;
        this.email = email;
        this.mommy = mommy;
        this.daddy = daddy;
        this.grades = setGrade();
        this.avgGrade = setAvgGrade();
    }
    
    }
}

