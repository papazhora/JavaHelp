package com.egor.javahelp.while_;

public class Main {
    private String s = "S";

    public static void main(String[] args) throws Exception {
        new Main().dollarAccount();
    }

    private void dollarAccount() {
        int i = 0;
        int j = 0;
        while (j < 10) {
            while (i < 10) {
                System.out.print(s);
                i++;
            }
            System.out.print("\n");
            j++;
            i = 0;
        }
    }
}

