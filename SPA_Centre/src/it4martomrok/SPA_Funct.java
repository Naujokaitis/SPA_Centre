package it4martomrok;

import java.util.Scanner;
import java.io.*;

/**
 * Created by Tomas on 2015-04-05.
 */
public class SPA_Funct implements FunctList {

    public String dateString(DateObject Date) {
        int d = Date.getDay();
        int m = Date.getMonth();
        int y = Date.getYear();
        int fileint = d * 1000000 + m * 10000 + y;
        String datafiletemp = String.valueOf(fileint);
        return datafiletemp + ".txt";
    }

    public void loadData() {
        try {
            String[][] Branches = new String[20][20];
            FileReader fr = new FileReader("branch.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            Scanner scan = null;
            int fir = 0,sec;
            // kintamieji

            while (line != null) {
                scan = new Scanner(line);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file.");
        } catch (IOException e) {
            System.out.println("Problem reading from file");

        }
    }
}
