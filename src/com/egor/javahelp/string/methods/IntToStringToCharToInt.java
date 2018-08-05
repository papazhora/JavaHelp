package com.egor.javahelp.string.methods;

/**
Сумма цифр трехзначного числа
*/

public class IntToStringToCharToInt {

    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        String str = String.valueOf(number);


        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        int d = Character.digit(a, 10);
        int d1 = Character.digit(b, 10);
        int d2= Character.digit(c, 10);

//        int d = Integer.valueOf(a);  возвращает ASCI-код символа.
//        int d1 = Integer.valueOf(b);
//        int d2 = Integer.valueOf(c);

        return d+d1+d2;

    }
    }

