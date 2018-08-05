package com.egor.javahelp.if_else;

import java.util.Scanner;

public class Main9 {

    private int a;
    private int b;
    private int c;

    public static void main(String[] args) throws Exception {
        new Main9().triangleTrue();
    }

    public void triangleTrue() {
        //int a = 0, b = 0, c = 0;
        System.out.print("Введите три числа: ");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else return;

        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextInt()) {
            b = scanner1.nextInt();
        }else return;

        Scanner scanner2 = new Scanner(System.in);
        if (scanner2.hasNextInt()) {
            c = scanner2.nextInt();
        } else return;

        if (a + b > c && a + c > b && c + b > a) {
            System.out.print("Треугольник существует.");
        } else System.out.print("Треугольник не существует.");
    }
}
