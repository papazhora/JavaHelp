package com.egor.javahelp.hasNextLine;

import java.util.Scanner;

/**
 * Author Egor Malinin
 * 05.07.2018
 */

public class Main {

    public static void main(String[] args){
        dayOfWeek();

    }

    public static void dayOfWeek() {

        System.out.print("Enter day of the week number: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();

            if (i > 7 || i < 1) {
                System.out.print("Error!");
                return;
            }

            if (i == 1) {
                System.out.print("Monday");
            } else System.out.print("Ok!");

            if (i == 2) {
                System.out.print("Thusday");
            } else System.out.print("Ok!");

        } else System.out.print("Error!");
    }


}
