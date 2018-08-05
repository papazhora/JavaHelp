package com.egor.javahelp.cwitch_case;

import java.util.Scanner;

/**
 *
 */

public class Main {

    public static void main(String[] args) {

        dayOfTheWeeks();
        }

        public static void dayOfTheWeeks () {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of weeks: ");
        if(!scanner.hasNext()) {
            System.out.print("Error!");
        }

        int i = scanner.nextInt();

        if (i > 7 || i < 1) {
            System.out.print("Error!");
        }

        switch (i) {

            case 1:
                System.out.print("понедельник");
                break;

            case 2:
                System.out.print("вторник");
                break;

            case 3:
                System.out.print("среда ");
                break;

            case 4:
                System.out.print("четверг");
                break;

            case 5:
                System.out.print("пятница");
                break;

            case 6:
                System.out.print("субота");
                break;

            case 7:
                System.out.print("воскресенье");
                break;

        }

    }
}
