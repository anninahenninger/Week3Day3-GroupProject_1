package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Dark", new String[]{"Math", "Biology", "Physics"});
        Teacher t2 = new Teacher("Mrs. Golightly",new String[]{"English", "Art", "Geography"});
        Teacher t3 = new Teacher("Mr. Just",new String[]{"PhyEdu", "Math", "Physics"});
        Teacher t4 = new Teacher("Mr. Happy", new String[]{"PhyEdu", "Geography", "English"});
        Teacher t5 = new Teacher("Mr. Gloriuous", new String[]{"Art", "Biology", "Geography"});
        Teacher t6 = new Teacher("Mr. Brilliant", new String[]{"English", "Math", "Art"});
        Teacher t7 = new Teacher("Mrs. Absolute", new String[]{"PhyEdu", "Geography", "Math"});
        Teacher t8 = new Teacher("Mrs. Lord", new String[]{"Art", "PhyEdu", "Physics"});
        Teacher t9 = new Teacher("Mrs. King", new String[]{"English", "Biology", "Physics"});
        Teacher t10 = new Teacher("Mrs. Allknows",new String[]{"PhyEdu", "Geography", "English"} );
        Teacher t11 = new Teacher("Mrs. Onpoint", new String[]{"Biology", "Geography", "Art"});
        Teacher t12 = new Teacher("Mrs. Strong", new String[]{"Physics", "PhyEdu", "Math"});
        Teacher t13 = new Teacher("Mr. Nothappy", new String[]{"Biology", "Math", "Physics"});
        Teacher t14 = new Teacher("Mr. Sure", new String[]{"Art", "Biology", "Math"});
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);
        teachers.add(t7);
        teachers.add(t8);
        teachers.add(t9);
        teachers.add(t10);
        teachers.add(t11);
        teachers.add(t12);
        teachers.add(t13);
        teachers.add(t14);


        String[] subjects = {"Math", "English", "Biology", "Geography", "Physics", "Art", "PhyEdu"};

        HashMap<String, Integer> pointsSt1_1st = new HashMap<>();
        pointsSt1_1st.put("Math",78);
        pointsSt1_1st.put("English",45);
        pointsSt1_1st.put("Biology",88);
        pointsSt1_1st.put("Geography",57);
        pointsSt1_1st.put("Physics",74);
        pointsSt1_1st.put("Art",1);
        pointsSt1_1st.put("PhyEdu",1);

        HashMap<String, Integer> pointsSt1_2nd = new HashMap<>();
        pointsSt1_2nd.put("Math",99);
        pointsSt1_2nd.put("English",72);
        pointsSt1_2nd.put("Biology",40);
        pointsSt1_2nd.put("Geography",63);
        pointsSt1_2nd.put("Physics",94);
        pointsSt1_2nd.put("Art",4);
        pointsSt1_2nd.put("PhyEdu",1);

        String [][][] sched1a = {{{"Math", "English", "Biology", "PhyEdu","PhyEdu"},
                                {"Biology", "Physics", "Art", "Math", "English"},
                                {"Geography", "Biology", "Physics", "Art", "Math"},
                                {"Physics", "Geography", "English", "Art", "Physics"}},
                                {{"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong","Mr. Strong"},
                                {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant","Mr.Dark"},
                                {"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint","Mrs.King" },
                                {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark", "Mr.Just"}}};

        String [][][] sched1b = {{{"English", "Biology", "PhyEdu", "Art"},
                                {"Geography", "Biology", "Physics", "Art"},
                                {"Physics", "Geography", "English", "Math"},
                                {"Biology", "Physics", "Art", "Math"}},
                                {{"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint"},
                                {"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong"},
                                {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark"},
                                {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant"}}};

        Student st1 = new Student("Benni", 7, Student.Classroom.A1, sched1a, pointsSt1_1st,
                "benniParents@email.com", "Ada Cool", "Adam Cool");

        st1.setPoints_2nd(pointsSt1_2nd);

        //st1.printSchedule();
        st1.printReport(2);
        st1.printAvgGradeOfSemester(2);
        System.out.println("christian test");
    }
}
