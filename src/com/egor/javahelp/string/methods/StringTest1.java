package com.egor.javahelp.string.methods;
import java.lang.Character;
import java.util.Scanner;

/**
 * Создать программу, которая будет проверять, является ли слово из пяти букв,
 * введённое пользователем, палиндромом (примеры: «комок», «ротор»).
 * Если введено слово не из 5 букв, то сообщать об ошибке.
 * Программа должна нормально обрабатывать слово, даже если в нём использованы
 * символы разного регистра. Например, слова «Комок» или «РОТОР» следует т
 * акже считать палиндромами.
 */

public class StringTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word of 5 letters: ");

            String str = scanner.nextLine();
            if (str.length() == 5)
                System.out.println(str + " OK!");

                else System.out.print("Error!");
        }
    }

