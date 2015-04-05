package it4martomrok;

/**
 * Created by Tomas on 2015-04-05.
 */
public class SPA_Funct implements FunctList {

    public String Datestring(DateObject Date) {
        int d = Date.getDay();
        int m = Date.getMonth();
        int y = Date.getYear();
        int fileint = d * 1000000 + m * 10000 + y;
        String datafiletemp = String.valueOf(fileint);
        return datafiletemp + ".txt";
    }

}
