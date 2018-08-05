package com.egor.javahelp.bufferedReader.buffered;

/**
 *
 */

import java.io.*;

public class Buffered {

    public void minPairOfNumbers() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int i = Integer.parseInt(br.readLine());
//        int j = Integer.parseInt(br.readLine());
        //System.out.println((i <= j) ? i :j);
        //System.out.println(Math.min(i, j));
        System.out.println(Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
    }
}
