package com.egor.javahelp.visibilityVariables;

public class Cat1 {

    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
