package com.egor.javahelp.if_else;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) throws Exception {
        pairOfNumbers();

    }

    public static void pairOfNumbers() {
        int i = 0;
        int j = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else return;

        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextInt()) {
            j = scanner1.nextInt();
        } else return;

        Scanner scanner2 = new Scanner(System.in);
        if (scanner2.hasNextInt()) {
            k = scanner2.nextInt();
        } else return;

        if (i == j && i == k) {
            System.out.print(i + " " + k + " " + j);
            return;
        } else if (i == j) {
            System.out.print(i + " " + j);
            return;
        } else if (i == k) {
            System.out.print(i + " " + k);
            return;
        } else if (j == k) {
            System.out.print(j + " " + k);
        }


    }
}
