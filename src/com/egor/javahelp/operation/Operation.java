package com.egor.javahelp.operation;

public class Operation {
    Integer a = 5, b = 7, c;
    String str1 = "Hot", str2 = " Java", result;

    public void foo() {
        c = a + b * a;
        result = str1 + str2;
        System.out.println(c);
        System.out.println(result);
        System.out.println(Math.PI);
    }
}
