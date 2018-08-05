package com.egor.javahelp.equals;

public class Main {

    public static void main(String[] args) {

        int i = 5;
        int j = 6;

        System.out.println(i == j); //false
        System.out.println(i);

        String s1 = new String("abc");
        String s2 = new String("abc");


        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false
    }
}
