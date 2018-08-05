package com.egor.javahelp.string.methods;

/**
 * Сумма цифр трехзначного числа
 *
 * Напиши код метода sumDigitsInNumber(int number).
 * Метод на вход принимает целое трехзначное число.
 * Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
 *
 */
public class IntToStringToChar {

    public static void main(String[] args) {

        System.out.print(sumDigitsInNumber(333));
    }
    public static int sumDigitsInNumber(int number) {
        return (number%1000/100 + number%100/10 + number%10);
    }
}
