import java.util.Formatter;

public class Time {


    public int hour;
    public int min;
    public int sec;



    Time(int hour, int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;

    }



    public int getHour(){
        return hour;
    }
    public int getMin(){
        return min;
    }
    public int getSec(){
        return sec;
    }
    public void setHour(int newHour){
        this.hour=newHour;
    }

    public void setMin(int newMin){
        this.min=newMin;
    }
    public void setSec(int newSec){
        this.sec=newSec;
    }
    public void setTime(int newHour, int newMin, int newSec){
        this.hour=newHour;
        this.min=newMin;
        this.sec=newSec;

    }



    //Makes class a string
    @Override
    public String toString(){
        return ((String.format("%02d",this.hour))+":"+(String.format("%02d",this.min))+":"+(String.format("%02d",this.sec)));
    }

    //Increases time by 1 second
    public void nextSecond() {
        this.sec = sec + 1;

        if (this.sec > 59 || this.sec < 0) {
            this.setSec(0);
            this.min = min + 1;
        }
        if (this.min > 59 || this.min < 0) {
            this.setMin(0);
            this.hour = hour + 1;
        }
        if (this.hour > 23 || this.hour < 0) {
            this.setHour(0);
        }


    }

    //Decreases time by 1 second
    public void previousSecond() {
            this.sec = sec - 1;

        if (this.sec > 59 || this.sec < 0) {
            this.setSec(0);
            this.min = min + 1;
        }
        if (this.min > 59 || this.min < 0) {
            this.setMin(0);
            this.hour = hour + 1;
        }
        if (this.hour > 23 || this.hour < 0) {
            this.setHour(0);
        }

    }





       /* if(hour<10) {
            hour = "0" + hour;
        }
        else
            hour=hour;
        }*/

    }






