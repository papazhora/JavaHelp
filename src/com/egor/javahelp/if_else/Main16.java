package com.egor.javahelp.if_else;

/**
 Описываем числа
 Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
 "четное однозначное число" - если число четное и имеет одну цифру,
 "нечетное однозначное число" - если число нечетное и имеет одну цифру,
 "четное двузначное число" - если число четное и имеет две цифры,
 "нечетное двузначное число" - если число нечетное и имеет две цифры,
 "четное трехзначное число" - если число четное и имеет три цифры,
 "нечетное трехзначное число" - если число нечетное и имеет три цифры.
 Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
 */

import java.io.*;

public class Main16 {
    public static void main(String[] args) throws Exception {
        new Main16().describeNumber();

    }
    private void describeNumber() throws Exception {
        numberProcessing(setUserNumber());
    }
    private String setUserNumber() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberStr = bufferedReader.readLine();
        return numberStr;
    }
    private void numberProcessing(String numberStr) throws Exception {
        int numberInt = Integer.parseInt(numberStr);
        if (numberInt > 0 && numberInt < 1000) {
//            if (numberInt % 2 == 0 && numberStr.length() == 1) {
//                System.out.println("четное однозначное число");
//            }
            if (numberInt % 2 == 0 && Integer.toString(numberInt).length() == 1) {
                System.out.println("четное однозначное число");
            }
            if (numberInt % 2 != 0 && numberStr.length() == 1) {
                System.out.println("нечетное однозначное число");
            }
            if (numberInt % 2 == 0 && numberStr.length() == 2) {
                System.out.println("четное двузначное число");
            }
            if (numberInt % 2 != 0 && numberStr.length() == 2) {
                System.out.println("нечетное двузначное число");
            }
            if (numberInt % 2 == 0 && numberStr.length() == 3) {
                System.out.println("четное трехзначное число");
            }
            if (numberInt % 2 != 0 && numberStr.length() == 3) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }

}
