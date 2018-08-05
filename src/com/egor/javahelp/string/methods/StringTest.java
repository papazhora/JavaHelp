package com.egor.javahelp.string.methods;

public class StringTest {

    public static void main(String[] args) {

        String str = "Enter you name";

        System.out.println(str.charAt(4)); //r
        System.out.println(str.codePointAt(2)); //116
        System.out.println(str.indexOf('t')); //2
        System.out.println(str.length()); //14  озвращает длину строки (количество символов в ней);
        System.out.println(str.isEmpty()); //folse  isEmpty() — проверяет, пустая ли строка;
        System.out.println(str.replace('e', 'R')); //EntRr you namR
        System.out.println(str.toLowerCase()); //enter you name
        System.out.println(str.toUpperCase()); //ENTER YOU NAME
        System.out.println(str.equals("fffff")); //fols
        System.out.println(str.equals("Enter you name")); //true
        System.out.println(str.lastIndexOf('n')); //10
        System.out.println(str.indexOf('r', 2)); //4



    }
}
