package com.egor.javahelp.math_max;

/**
 * Среднее из трех чисел
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {


        private int num1;
        private int num2;
        private int num3;
        public static void main(String[] args) throws Exception {
            new Main1().medium();
        }
        private void medium() {
            processingNum(getNum1(), getNum2(), getNum3());
        }
        private void processingNum(int num1, int num2, int num3) {
            int a = Math.max(Math.max(num1, num2), num3);
            int b = Math.min(Math.min(num1, num2), num3);
            int res =(num1+num2+num3) - (a + b);
            System.out.println(res);
        }
        public int getNum1() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                num1 = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return num1;
        }
        public int getNum2() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                num2 = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return num2;
        }
        public int getNum3() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                num3 = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return num3;
        }
    }

