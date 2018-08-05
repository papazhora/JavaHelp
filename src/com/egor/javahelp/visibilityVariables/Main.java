//package com.egor.javahelp.visibilityVariables;
//
//public class Main {
//
//    public class Variables
//
//    {
//┃┃private static String TEXT = "The end.";
//┃┃  ┗━━━━━━━━━━━━━━┛
//┃┃public static void properties (String[]args)
//┃┃ ┏                         ┗━━━━━━━┛
//┃┃ ┃{
//┃┃ ┃System.out.println("Hi");
//┃┃ ┃String s = "Hi!";
//┃┃ ┃  ┏┗━━━━┛
//┃┃ ┃  ┃System.out.println(s);
//┃┃ ┃  ┃if (args != null)
//┃┃ ┃  ┃{
//┃┃ ┃  ┃String s2 = s;
//┃┃ ┃  ┃   ┗━━━━┛
//┃┃ ┃  ┃  ┏
//┃┃ ┃  ┃  ┃System.out.println(s2);
//┃┃ ┃  ┃  ┗
//┃┃ ┃  ┃}
//┃┃ ┃  ┃Variables variables = new Variables();
//┃┃ ┃  ┃System.out.println(variables.classVariables);
//┃┃ ┃  ┃System.out.println(TEXT);
//┃┃ ┃  ┗
//┃┃ ┃}
//┃┃ ┗
//┃┃public String classVariables;
//┃┃  ┗━━━━━━━━━━━━━━━┛
//┃┃   public Variables()
//┃┃{
//┃┃classVariables = "Class Variables test.";
//┃┃}
//┃┃}
//┃┗
//}
//
//        1. Переменная, объявленная в методе, существует/видна с начала объявления
//        до конца метода.
//
//        2. Переменная, объявленная в блоке кода, существует до конца этого
//        блока кода.
//
//        3. Переменные — аргументы метода — существуют до конца выхода из метода.
//
//        4. Переменные класса/объекта существуют все время жизни содержащего
//        их объекта. Их видимость регулируется специальными модификаторами доступа.
//
//        5. Статические переменные классов существуют все время работы программы.
//        Их видимость также определяется модификаторами доступа.
//
//class Main
//{
//    public int count = 0;     //объявили переменную класса
//
//    public void run()
//    {
//        count = 15;           //обращение к переменной класса
//        int count = 10;       //объявили локальную переменную метода
//        count ++;             //обращение к переменной метода
//    }
//}



