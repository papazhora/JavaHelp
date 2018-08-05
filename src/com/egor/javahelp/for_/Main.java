package com.egor.javahelp.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private int m;
    private int n;
    private int s = 8;

    public static void main(String[] args) throws Exception {
        new Main().drawingRectangle();

    }

    private void drawingRectangle() {
        processing(setM(), setN());
    }

    private int setM() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            m = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }

    private int setN() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }

    private void processing(int m, int n) {
        for (int j = 1; j <= m; j++) {

            for (int i = 1; i <= n; i++) {
                System.out.print(s);
            }
            System.out.print("\n");

        }
    }


}

