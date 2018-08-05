package com.egor.javahelp.visibilityVariables;

public class Var {

    public static void main(String[] args) {
        Var var = new Var(0, "hhh");
        var.test();
        var.go(5);

    }


        // instance variables
        private int i; // 0
        private String name; // null
        private int j = 7;


    public Var( int i, String name){   // constructor
            this.i = i;
            this.name = name;
        }

        private void test () {
            i = 4;
            int a = 0; // local variable
            go(a);
        }

        public void go ( int a){
            i = a;
            a = 10;
            int count = 5; // local variable
            System.out.println(i);
            System.out.println(a);
            if (count < 7){
                int j = 4; // j видна внутри if
                j = 1;
                //int j = 0;
            }
            else {
                int j = 6;
                j = 5;
            }
            j = 4;
        }

        public int getI () {
            return i;
        }

        public String getName () {
            return name;
        }

        public void setI ( int i){
            this.i = i;
        }

        public void setName (String name){
            this.name = name;
        }
    }

