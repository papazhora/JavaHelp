package com.egor.javahelp.if_else;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        dayOfTheWeek();

    }

    public static void dayOfTheWeek() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week number: ");
        if (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i > 7 || i < 1) {
                System.out.print("такого дня недели не существует");
                return;
            }
            if (i == 1) {System.out.print("понедельник");}
            if (i == 2) {System.out.print("вторник");}
            if (i == 3) {System.out.print("среда");}
            if (i == 4) {System.out.print("четверг");}
            if (i == 5) {System.out.print("пятница");}
            if (i == 6) {System.out.print("суббота");}
            if (i == 7) {System.out.print("воскресенье");}

        } else System.out.print("Введите число");



    }
    }

