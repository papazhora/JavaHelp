package com.egor.javahelp.if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerParseIntReaderReadLine {

    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try {
            i = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(i);
    }
}
