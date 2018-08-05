package com.egor.javahelp.if_else;

public class Main {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5)
            System.out.println("Число меньше 5");
        else
        if (a > 5)
            System.out.println("Число больше 5");
        else
        if (a == 5)
            System.out.print("Число равно 5");
    }
}
