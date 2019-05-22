package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;

public class Schedule {


    private String weekDay;
    private String [][] subjHour; //subject/hour



    public Schedule(String weekDay, String [][] subjHour){

        this.weekDay = weekDay;
        this.subjHour= subjHour;


    }

    public void getWeekDay(){
        this.weekDay = weekDay;
    }

    public void setWeekDay(String weekDay){
        this.weekDay=weekDay;
    }

    public void getSubjHour(){
        this.subjHour=subjHour;
    }


}
