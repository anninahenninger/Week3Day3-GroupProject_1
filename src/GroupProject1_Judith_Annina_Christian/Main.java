package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Dark", new String[]{"Math", "Biology", "Physics"});
        Teacher t2 = new Teacher("Mrs. Golightly",);
        Teacher t3 = new Teacher("Mr. Just",);
        Teacher t4 = new Teacher("Mr. Happy", );
        Teacher t5 = new Teacher("Mr. Gloriuous", );
        Teacher t6 = new Teacher("Mr. Brilliant", );
        Teacher t7 = new Teacher("Mrs. Absolute", );
        Teacher t8 = new Teacher("Mrs. Lord", );
        Teacher t9 = new Teacher("Mrs. King", );
        Teacher t10 = new Teacher("Mrs. Allknows", );
        Teacher t11 = new Teacher("Mrs. Onpoint", );
        Teacher t12 = new Teacher("Mrs. Strong", );
        Teacher t13 = new Teacher("Mr. Nothappy", );
        Teacher t14 = new Teacher("Mr. Sure", );

        String[] subjects = {"Math", "English", "Biology", "Geography", "Physics", "Art", "PhyEdu"};

        HashMap<String, Integer> pointsSt1 = new HashMap<>();
        pointsSt1.put("Math",78);
        pointsSt1.put("English",78);
        pointsSt1.put("Biology",78);
        pointsSt1.put("Geography",78);
        pointsSt1.put("Physics",78);
        pointsSt1.put("Art",78);
        pointsSt1.put("PhyEdu",78);

        Student st1 = new Student("Benni", 7, new subjects, "benniParents@email.com", "Ada Cool", "Adam Cool");


    }
}
