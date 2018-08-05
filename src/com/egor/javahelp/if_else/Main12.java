package com.egor.javahelp.if_else;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main12 {
    public static void main(String[] args) throws Exception {
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(br.readLine());

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        j = Integer.parseInt(br2.readLine());

        if (i <= j) {
            System.out.println(i);
        } else System.out.println(j);
    }
}
