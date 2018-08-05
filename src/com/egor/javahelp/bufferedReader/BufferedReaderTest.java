package com.egor.javahelp.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter you name: ");

        try {
           String str = bufferedReader.readLine();
           if (str.length() <=3)
           System.out.print("You name is " + str);
                else System.out.print("Error!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
