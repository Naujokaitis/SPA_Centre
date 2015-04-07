package it4martomrok;

import java.util.Date;

/**
 * Created by Tomas on 2015-04-05.
 */
public class Navigator implements NavigationOptions {

    DateObject data = new DateObject(1, 1, 1, 1, 1, true);
    int temp;

    public void addHour(DateObject Date){
        temp = Date.getHour() + 1;

        if (temp > 23){
            addDay(Date);
            temp = 0;
        }

        Date.setHour(temp);
    }

    public void addDay(DateObject Date) {
        temp = Date.getDay() + 1;

        if (temp > 31) {
            addMonth(Date);
            temp = 1;
        }

        Date.setDay(temp);
    }

    public void addMonth(DateObject Date) {
        temp = Date.getMonth() + 1;

        if (temp > 12) {
            addYear(Date);
            temp = 1;
        }

        Date.setMonth(temp);

    }

    public void addYear(DateObject Date) {
        temp = Date.getYear() + 1;
        Date.setYear(temp);
    }

    public void decHour(DateObject Date){
        temp = Date.getHour() - 1;
        if (temp < 0) {
            decDay(Date);
            temp = 23;
        }
        Date.setHour(temp);
    }


    public void decDay(DateObject Date) {
        temp = Date.getDay() - 1;
        if (temp < 1) {
            decMonth(Date);
            temp = 31;
        }
        Date.setDay(temp);
    }

    public void decMonth(DateObject Date) {
        temp = Date.getMonth() - 1;
        if (temp < 1) {
            decYear(Date);
            temp = 12;
        }
        Date.setMonth(temp);
    }

    public void decYear(DateObject Date) {
       temp = Date.getYear() - 1;
        Date.setYear(temp);
    }
}

