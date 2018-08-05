package com.egor.javahelp.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest1 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter you name: ");

        try {
            System.out.print("You name is " + bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
