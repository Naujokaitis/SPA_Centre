package it4martomrok;

import java.util.Date;

/**
 * Created by Tomas on 2015-04-05.
 */
public class Navigator implements NavigationOptions {

    DateObject data = new DateObject(1, 1, 1, 1, 1, true);

    public void addDay(DateObject Date) {
        System.out.println("+Diena");
    }

    public void addMonth(DateObject Date) {
        System.out.println("+Menesis");
    }

    public void addYear(DateObject Date) {
        System.out.println("+Metai");
    }

    public void decDay(DateObject Date) {
        System.out.println("-Diena");
    }

    public void decMonth(DateObject Date) {
        System.out.println("-Menesis");
    }

    public void decYear(DateObject Date) {
        System.out.println("-Metai");
    }
}

