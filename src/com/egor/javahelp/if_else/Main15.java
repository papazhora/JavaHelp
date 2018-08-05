package com.egor.javahelp.if_else;


/**
 Ярлыки и числа
 Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
 "отрицательное четное число" - если число отрицательное и четное,
 "отрицательное нечетное число" - если число отрицательное и нечетное,
 "ноль" - если число равно 0,
 "положительное четное число" - если число положительное и четное,
 "положительное нечетное число" - если число положительное и нечетное.
 */

import java.io.*;

public class Main15 {
    public static void main(String[] args) throws Exception {
        new Main15().labelsAndNumbers();
    }
    private void labelsAndNumbers() throws Exception {
        numberProcessing();

    }
    private int setNumber() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        return number;
    }
    private void numberProcessing() throws Exception {
        int numberProc = setNumber();
        if (numberProc < 0 && (numberProc % 2) == 0 ) {
            System.out.print("отрицательное четное число");
        }
        if (numberProc < 0 && numberProc % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
        if (numberProc == 0) {
            System.out.println("ноль");
        }
        if (numberProc > 0 && numberProc % 2 == 0) {
            System.out.println("положительное четное число");
        }
        if (numberProc > 0 && numberProc % 2 != 0) {
            System.out.println("положительное нечетное число");
        }
    }
}
