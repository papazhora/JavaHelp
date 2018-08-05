package com.egor.javahelp.Math.round;

/**
 * Округление
 */
public class Math_round {

    public static void main(String args[]){

        double d1 = 1.49;
        double d2 = 1.50;
        double d3 = 1.75;
        double d4 = -1.49;
        double d5 = -1.50;
        double d6 = -1.75;

        float f1 = 10;
        float f2 = 9f;
        float f3 = -10;
        float f4 = -9f;

        System.out.println("d1 = " + Math.round(d1));
        System.out.println("d2 = " + Math.round(d2));
        System.out.println("d3 = " + Math.round(d3));
        System.out.println("d4 = " + Math.round(d4));
        System.out.println("d5 = " + Math.round(d5));
        System.out.println("d6 = " + Math.round(d6));
        System.out.println("-----------");
        System.out.println("f1 = " + Math.round(f1));
        System.out.println("f2 = " + Math.round(f2));
        System.out.println("f3 = " + Math.round(f3));
        System.out.println("f4 = " + Math.round(f4));
    }
}

