package com.egor.javahelp.scanner;

import java.util.Scanner;

/**
 * В классе есть методы для чтения очередного символа заданного типа со
 * стандартного потока ввода, а также для проверки существования такого символа.
 *
 * Для работы с потоком ввода необходимо создать объект класса Scanner, при создании
 * указав, с каким потоком ввода он будет связан. Стандартный поток ввода (клавиатура)
 * в Java представлен объектом — System.in. А стандартный поток вывода (дисплей) —
 * уже знакомым вам объектом System.out. Есть ещё стандартный поток для вывода
 * ошибок — System.err, но работа с ним выходит за рамки нашего курса.
 */

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = scanner.nextInt();
        System.out.print("Namber is " + i);

    }
}
