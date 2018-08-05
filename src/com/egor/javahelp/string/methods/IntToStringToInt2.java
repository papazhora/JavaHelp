package com.egor.javahelp.string.methods;
import java.util.Scanner;

/**
 * * Сумма цифр трехзначного числа
 *  *
 *  * Напиши код метода sumDigitsInNumber(int number).
 *  * Метод на вход принимает целое трехзначное число.
 *  * Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
 */

public class IntToStringToInt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter namber: ");
        System.out.print("Enter namber: " + SumNamber(scanner.nextInt()));

    }
    public static int SumNamber (int namber) {

        String str = Integer.toString(namber);
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(1)));
        int c = Integer.parseInt(String.valueOf(str.charAt(2)));

        return a+b+c;
    }
}
