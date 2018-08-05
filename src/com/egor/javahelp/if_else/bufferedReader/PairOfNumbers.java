package com.egor.javahelp.if_else.bufferedReader;

/**
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairOfNumbers {

    public void pairOfNumbers() {
        System.out.println("Enter number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;

        {
            try {
                str = bufferedReader.readLine();
                int i = Integer.parseInt(str);

            } catch (IOException e) {
                System.out.println("Error! Enter number!");
            }
        }
    }
}
