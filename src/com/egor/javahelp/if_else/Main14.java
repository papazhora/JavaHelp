package com.egor.javahelp.if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Три числа
 *
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других,
 * равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 */
public class Main14 {
    public static void main(String[] args) throws Exception {
        Main14.outPrintId();
    }

    public int[] setThreeNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int[] setUserNumbers = {num1, num2, num3};
        return setUserNumbers;
    }

    public static void outPrintId() throws IOException {
        Main14 solution = new Main14();
        int[] arr = solution.setThreeNumbers();
        for (int i = 0; i < arr.length; i++ )
            if (arr[i] != arr[i + 1] && arr[i + 1] == arr[i + 2]) {
                System.out.println(++i);
                return;
            } else if (arr[i + 1] != arr[i] && arr[i] == arr[i + 2]) {
                System.out.println(i + 2);
                return;
            } else if (arr[i + 2] != arr[i] && arr[i] == arr[i + 1]) {
                System.out.println(i + 3);
                return;
            } else return;
    }
}
