package com.egor.javahelp.if_else;

import java.util.Scanner;

/**
 *
 */
public class ScannerIfElse {

    public static void main(String[] args) {

        Hello();
    }

    public static void Hello() {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 0)
            System.out.print(++i);
        if (i > 0)
            System.out.print(i *=2);
        if (i == 0)
            System.out.print(i);
    }
}
