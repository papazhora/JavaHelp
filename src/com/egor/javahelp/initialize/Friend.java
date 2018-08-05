package com.egor.javahelp.initialize;

/*
Создать класс Friend
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        Friend friend = new Friend("yyy",77,'m');
        friend.initialize("ddddd", 50, 'm');
        System.out.println(friend.name);
        System.out.println(friend.age);
        System.out.println(friend.sex);
    }
}
