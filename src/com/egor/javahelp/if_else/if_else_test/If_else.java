package com.egor.javahelp.if_else.if_else_test;

public class If_else {

    public void testMethod(int count) {
        if (count > 5) {
            count++;
            //test2();
        } else if (count < 0) {
            count = -10;
        } else {
            count += 5;
            //test3();
        }

        String a = "aaa";
        switch (a) {
            case "aaa":
                test2();
                break;
            case "sss":
                test3();
                break;
            default:
        }


        //тернарный оператор
        count = count > 0 ? count + 1 : count + 5;
        System.out.println(count);
    }

        private void test2() {
            System.out.println("test2");
        }

        private void test3() {
            System.out.println("test3");
        }

}
