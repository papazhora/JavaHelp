package com.egor.javahelp.math_max;

/**
 * Макс из 4 чисел
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        System.out.print(Math.max((Math.max(i, j)), (Math.max(k, l))));
    }


}
