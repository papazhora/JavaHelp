package com.egor.javahelp.while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    private String userStrNumber;
    private int numberInt;
    private int result;
    private final String num = "-1";

    @Override
    public String toString() {
        return "Solution{" +
                "userStrNumber='" + userStrNumber + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        new Main2().sumNumber();
    }

    public void sumNumber() {
        do {
            processing(getUserStrNumber());

        } while (!userStrNumber.equals(num));
        return;
    }


    public String getUserStrNumber() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userStrNumber = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userStrNumber;
    }

    public void processing(String userStrNumber) {
        while (true) {
            if (userStrNumber.equals(num)) {
                System.out.print(result - 1);
                break;

            } else  numberInt = Integer.parseInt(userStrNumber);
            result += numberInt;
            return;
        }
    }

}

