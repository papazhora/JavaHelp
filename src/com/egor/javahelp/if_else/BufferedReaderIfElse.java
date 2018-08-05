package com.egor.javahelp.if_else;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderIfElse {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String i = bufferedReader.readLine();
        int a = Integer.parseInt(i);
        hello(a);

    }
    public static void hello (int g) {
        if (g < 0)
            System.out.print(++g);
        if (g > 0)
            System.out.print(g *=2);
        if (g == 0)
            System.out.print(g);
    }
}
