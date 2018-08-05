package com.egor.javahelp.if_else;

import java.util.Scanner;

/**
 * Сколько дней в году?
 */

public class Main8 {
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
            if ((i % 400) == 0) {
                System.out.println("количество дней в году: 366");
                return;

            } else if (i % 100 == 0) {
                System.out.println("количество дней в году: 365");
                return;
            }
            if (!(i % 4 == 0) && (!(i % 100 == 0))) {
                System.out.println("количество дней в году: 365");
                return;
            }
            if (i % 4 == 0 && (!(i % 100 == 0))) {
                System.out.println("количество дней в году: 366");
                return;
            }


        } else System.out.println("Ошибка ввода.");
    }
}
