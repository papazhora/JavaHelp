package com.egor.javahelp.scanner;

import java.util.Scanner;

/**
 * Метод hasNextInt(), применённый объекту класса Scanner, проверяет,
 * можно ли считать с потока ввода вещественное число типа int, а
 * метод nextInt() — считывает его. Если попытаться считать значение
 * без предварительной проверки, то во время исполнения программы можно получить
 * ошибку (отладчик заранее такую ошибку не обнаружит). Например, попробуйте в
 * представленной далее программе ввести какое-то вещественное число:
 */

public class HasNextInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer namber: ");
        if (scanner.hasNextInt()) {    // возвращает истинну если с потока ввода можно считать
            int i = scanner.nextInt(); // считывает целое число с потока ввода и сохраняем в
            System.out.print("Namber is " + i);
        } else {
           System.out.print("Namber is not integer!");
        }
    }
}
