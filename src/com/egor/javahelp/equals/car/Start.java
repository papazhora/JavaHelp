package com.egor.javahelp.equals.car;

public class Start {

    public static void main(String[] args) {

        Car car = new Car("BMW");
        Car car1 = new Car("Toyota");

        System.out.println(car == car1); //false
        System.out.println(car.equals(car1)); //false

    }
}
