package com.egor.javahelp.references;

public class References {
    String str = "Egor MAlinin!";
    String str3 = "";
    String str2 = new String("Wwwwww");

    public void foo() {
        new String("Vvvvvv");
//        System.out.println(a.hashCode());
//        System.out.println(a.toString());
//        System.out.println(a.byteValue());
//        System.out.println(a.compareTo(b));
//        System.out.println(a.equals(d));
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(z));
//        System.out.println(a.equals(g));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.lastIndexOf('i', 'g'));
        System.out.println(str.replace('M', 'Z'));
        System.out.println(str.equals(str2));
        System.out.println(str3.isEmpty());
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(12));
        System.out.println(str.codePointAt(6));
        System.out.println(str.replaceAll("Egor", "Gosha" ));
        System.out.println(str.toCharArray().length);
        System.out.println();

    }
        Byte a = 127; // 2E8
        byte b = 127;
        Short c = 7777; //2E16
        short d = -7777;
        Integer e = 222222222; //2E32
        int f = - 222222222;
        Long l = 7777777777777777777L;
        long h = - 7777777777777777777L;
        Character z = 'A';
        char x = 65;
        Float r = 2.2222222222f; //2E16
        float w = 22222222222222222222222222222222f;
        Double o = 2.2; //2E32
        double n = 5.5;
        Boolean g = true;
        boolean u = false;





}
