package exs;

import java.util.Scanner;

public class switch_try {
    public static void Switch_try() {
        System.out.println("SWITCH prin char");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti  de ce doriti sa efectuati:");
        System.out.println("Adunare");
        System.out.println("Scadere");
        System.out.println("Inmultire");

        switch (scanner.nextLine()) {
            case ("Adunare") -> {
                System.out.println("Introduceti numere pentru adunare:");
                System.out.println("Daca doriti sa finisati tastati 0");
                int sum = 0;
                while (scanner.hasNext()) {
                 int readed = scanner.nextInt();
                    if (readed == 0) break;
                    else {
                 sum += readed;
                    }
                }
                System.out.println("Suma este:" + sum);

            }
            case ("Scadere") -> {
                System.out.println("Introduceti un numar din care v-om scadea: ");
                int readedinitial = scanner.nextInt();
                while (scanner.hasNext()) {
                    int readed = scanner.nextInt();
                    if (readed == 0) break;
                    else {
                        readedinitial -= readed;
                    }
                }
                System.out.println("Numarul final este : "+readedinitial);
            }
            case ("Inmultire") -> {
                int prod = 1 ;

                System.out.println("Introduceti numerele pentru inmultire");
                while (scanner.hasNext()){
                int  var = scanner.nextInt();
                if(var==0) break;
                else {
                    prod *= var;
                }
                }
                System.out.println("Produsul este : "+prod);
            }
            default -> System.out.println("Nu ati alses nici o optiune");
        }
    }
}









