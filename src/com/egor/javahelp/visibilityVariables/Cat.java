package com.egor.javahelp.visibilityVariables;

public class Cat {


        private String name = "безымянный кот";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }

