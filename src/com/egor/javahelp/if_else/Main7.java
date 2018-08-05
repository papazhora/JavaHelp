package com.egor.javahelp.if_else;

import java.util.Scanner;

/**
 Количество дней в году
 */

public class Main7 {

        public static void main(String[] args) throws Exception {
            countDaysInYear();
        }

        public static void countDaysInYear() {
            System.out.print("Введите год: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i <= 0) {
                    System.out.println("Введите положительное число больше \"0.\"");
                    return;
                } else
                if ((i % 4) == 0) {
                    System.out.println("количество дней в году: 366");

                } else System.out.println("количество дней в году: 365");

            } else System.out.println("Ошибка ввода.");
        }
    }

