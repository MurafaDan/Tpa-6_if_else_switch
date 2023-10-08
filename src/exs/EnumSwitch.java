package exs;

import java.util.Scanner;
 enum Day {
    LUNI , MARTI , MIERCURI , JOI , VINERI , SAMBATA , DUMINICA
}

public class EnumSwitch {
    public static void enumSwitch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o zi a saptamanii pentru a vedea orarul: ");

        String inputUser = scanner.nextLine();

        Day selectedDay = Day.valueOf(inputUser);


        switch (selectedDay) {
            case LUNI -> {
                System.out.println("L.Engleza 9.45-11.15");
                System.out.println("L/L OOP 11:30-13:00");
                System.out.println("L/L PI 13:30-15:00");
                System.out.println("L/L MN 15:15-16:45");
            }
            case MARTI -> {
                System.out.println("L.Engleza 9.45-11.15");
                System.out.println("C Metode Numerice  11:30-13:00");
                System.out.println("Programarea Interactiva 13:30-15:00");
            }
            case MIERCURI -> {
                System.out.println("C. OOP 8:00-9:30");
                System.out.println("Baze de Date 9:45 - 11:15");
                System.out.println("Ed Fizica 11:30 - 13:00");
            }
            case JOI -> {
                System.out.println("Baze de date 8:00 - 9:30");
                System.out.println(" C Programarea interactiva 9:45 - 11:15 ");
            }
            case VINERI -> {
                System.out.println("Dreptul de proprietate intelectuala 8:00 - 9:30");
                System.out.println("Dreptul de proprietate intelectuala 9:45 - 11:15");
                System.out.println("L/L Baze de Date 11:30 - 13:00");
            }
            case SAMBATA , DUMINICA ->{
                System.out.println("Zi de odihna :D");
            }
        }

    }
}
