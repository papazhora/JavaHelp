package com.egor.javahelp.cwitch_case;

import java.util.Scanner;

/**
 * Author Egor Malinin, 05.07.2018
 * version 1.0
 */

public class Main1 {

    public static void main(String[] args) {

        dayOfWeek();

    }

    public static void dayOfWeek() {

        System.out.print("Enter day of the week number: ");
        Scanner scanner = new Scanner(System.in);

        //System.out.print(scanner.next());
        //int i = scanner.nextInt();

        if (scanner.hasNextInt()) {
            System.out.println("OK!");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Monday");
                    break;

                default:
                    System.out.print("такого дня недели не существует");
            }

        } else System.out.print("Error!");

    }
}
