package com.egor.javahelp.bufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

    public static void main(String[] args) throws Exception {
        new BufferedReader().trafficLight();
    }

    public void trafficLight() {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            double t = Double.parseDouble(str);
            for (int i = 0; i<= 12; i++) {
                if (t > 0 + 5 * i && t <= 3 + 5 * i) {
                    System.out.println("зелёный");
                }

                if (t > 3 + 5 * i && t <= 4 + 5 * i) {
                    System.out.println("жёлтый");
                }

                if (t > 4+5*i && t <= 5+5*i) {
                    System.out.println("красный");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
