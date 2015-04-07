package it4martomrok;

import java.util.Date;

/**
 * Created by Tomas on 2015-04-05.
 */
public class DateObject {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private boolean weekend;

    public DateObject(int day, int month, int year, int hour, int minute, boolean weekend) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.weekend = weekend;
    }

    public void DatePrint(DateObject Date) {
        String ending;
        if (day == 01) ending = "st";
        else if (day == 02) ending = "nd";
        else if (day == 03) ending = "rd";
        else ending = "th";

        if (hour == 0){
            System.out.println("The " + day + ending + " of " + monthToString(month) + ", " + year + ", Midnight.");
        }
        else if ( 0 < hour && hour < 13 ){
            System.out.println("The " + day + ending + " of " + monthToString(month) + ", " + year + ", " + hour + " am.");
        }
        else if ( hour >= 13 && hour <= 23){
            System.out.println("The " + day + ending + " of " + monthToString(month) + ", " + year + ", " + hour + " pm.");
        }




    }

    public String monthToString(int month) {
        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

        }
        return "Invalid month inserted";
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean getWeekend() {
        return weekend;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
