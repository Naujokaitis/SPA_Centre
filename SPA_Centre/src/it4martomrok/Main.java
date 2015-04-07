package it4martomrok;
//Epic ne
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FunctList Meth = new SPA_Funct();
        NavigationOptions Nav = new Navigator();
        DateObject Date = new DateObject(10, 12, 1999, 15, 20, true);
        //System.out.print(Meth.Datestring(15, 12, 1999));
        Scanner input = new Scanner(System.in);

        //Pries tai turi but pasirenkamas branch'as
        int brake = 1, brake2 = 1, action, action2;

        while (brake > 0) {
            Date.DatePrint(Date);
            System.out.println("Choose an action: ");
            System.out.println("1. Change date");
            System.out.println("2. xx");
            System.out.println("3. xx");
            System.out.println("4. xx");
            System.out.println("5. xx");
            System.out.println("6. Exit");
            action = (input.nextInt());

            switch (action) {

                case 1:

                    while (brake2 > 0) {
                        Date.DatePrint(Date);
                        System.out.println("Choose an action: ");
                        System.out.println("1. Go forward a day");
                        System.out.println("2. Go forward a month");
                        System.out.println("3. Go forward a year");
                        System.out.println("4. Go back a day");
                        System.out.println("5. Go back a week");
                        System.out.println("6. Go back a year");
                        System.out.println("7. Menu");
                        action2 = (input.nextInt());

                        switch (action2) {

                            case 1:
                                Nav.addDay(Date);
                                break;
                            case 2:
                                Nav.addMonth(Date);
                                break;
                            case 3:
                                Nav.addYear(Date);
                                break;
                            case 4:
                                Nav.decDay(Date);
                                break;
                            case 5:
                                Nav.decMonth(Date);
                                break;
                            case 6:
                                Nav.decYear(Date);
                                break;
                            case 7:
                                brake2 = 0;
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                    }

                        break;



                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    brake = 0;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        }

        input.close();

    }
}
