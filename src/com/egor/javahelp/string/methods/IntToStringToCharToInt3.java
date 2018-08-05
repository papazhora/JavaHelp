package com.egor.javahelp.string.methods;

import java.util.Scanner;

/**
 *  Сумма цифр трехзначного числа
 *
 *   Напиши код метода sumDigitsInNumber(int number).
 *   Метод на вход принимает целое трехзначное число.
 *   Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
 */

public class IntToStringToCharToInt3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter namber: ");
        System.out.print("Sum nambers = " + SumNambers(scanner.nextInt()));

    }

    public static int SumNambers(int namber) {

        String str = Integer.toString(namber);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            //sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
            sum = sum + Character.getNumericValue(str.charAt(i));

        }
        return sum;

    }
}

