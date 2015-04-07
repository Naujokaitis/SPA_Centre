package it4martomrok;
//Epic ne
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FunctList Meth = new SPA_Funct();
        NavigationOptions Nav = new Navigator();
        DateObject Date = new DateObject(10, 1, 1999, 0, 20, true);
        //System.out.print(Meth.Datestring(15, 12, 1999));
        Scanner input = new Scanner(System.in);

        //Pries tai turi but pasirenkamas branch'as
        int brake = 1, brake2 = 1, action, action2;

        while (brake > 0) {
            Date.DatePrint(Date);
            System.out.println("Choose an action: ");
            System.out.println("1. Change date");
            System.out.println("2. Change place");
            System.out.println("3. Change service");
            System.out.println("4. Treatment service");
            System.out.println("5. Change time");
            System.out.println("6. Buy ticket");
            System.out.println("7. Exit");
            action = (input.nextInt());

            switch (action) {

                case 1:

                    while (brake2 > 0) {
                        Date.DatePrint(Date);
                        System.out.println("Choose an action: ");
                        System.out.println("1. Go forward an hour");
                        System.out.println("2. Go forward a day");
                        System.out.println("3. Go forward a month");
                        System.out.println("4. Go forward a year");
                        System.out.println("5. Go back an hour");
                        System.out.println("6. Go back a day");
                        System.out.println("7. Go back a month");
                        System.out.println("8. Go back a year");
                        System.out.println("9. Menu");
                        action2 = (input.nextInt());

                        switch (action2) {

                            case 1:
                                Nav.addHour(Date);
                                break;
                            case 2:
                                Nav.addDay(Date);
                                break;
                            case 3:
                                Nav.addMonth(Date);
                                break;
                            case 4:
                                Nav.addYear(Date);
                                break;
                            case 5:
                                Nav.decHour(Date);
                                break;
                            case 6:
                                Nav.decDay(Date);
                                break;
                            case 7:
                                Nav.decMonth(Date);
                                break;
                            case 8:
                                Nav.decYear(Date);
                                break;
                            case 9:
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

                    break;

                case 7:

                    brake = 0;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        }

        input.close();

    }
}
/*
Funkcionalumas:
Programa ávairius pasirinkimus pateiks meniu pavidalu.
Naudotojas galës pasirinkti datà, vietà, paslaugà ir nusipirkti bilietus.
Failuose yra saugomi duomenys, kuriuos programa naudos(Nenusprendëm dar kiek failø reikës).
Programa kurs failus datos pavadinimu á kuriuos áraðinës paslaugos pavadinimus ir laikus kada ji yra uþimta.
Taip pat programoje bus pridëta ðventinës dienos ir ðventinës kainos
 */
