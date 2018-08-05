package com.egor.javahelp.if_else;

/**
 * Цель установлена!
 *
 * Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
 * Вывести на экран номер координатной четверти, в которой находится данная точка.
 * Подсказка:
 * Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
 * для первой четверти a>0 и b>0;
 * для второй четверти a<0 и b>0;
 * для третьей четверти a<0 и b<0;
 * для четвертой четверти a>0 и b<0.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {
    public static void main(String[] args) throws Exception {
        new Main13().setPointsCoordinates();

    }
    private void setPointsCoordinates() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int[] pointCoordinates = {a, b};
        outPrintSquare(pointCoordinates);

    }

    private void outPrintSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i+1] > 0) {
                System.out.println(1);
                return;
            } else if (arr[i] < 0 && arr[i+1] >0) {
                System.out.println(2);
                return;
            } else if (arr[i] < 0 && arr[i+1] < 0) {
                System.out.println(3);
                return;
            } else if (arr[i] > 0 && arr[i+1] < 0) {
                System.out.println(4);
                return;
            }
        }
    }
}
