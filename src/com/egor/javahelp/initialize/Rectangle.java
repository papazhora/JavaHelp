package com.egor.javahelp.initialize;



    /*
Собираем прямоугольник
*/

    public class Rectangle {
        private int top, left, width, height;

        public void initialize(int top, int left, int width, int height) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public void initialize(int top, int left) {
            this.top = top;
            this.left = left;
        }

        public void initialize(int top, int left, int width) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }

        public void initialize(Rectangle rectangle) {
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

        public void initialize(int top, Rectangle rectangle) {
            this.top = top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

        public void initialize(Rectangle rectangle, int width, int height) {
            initialize(rectangle.top, rectangle.left);
            this.width = width;
            this.height = height;
        }

        public void initialize(Rectangle rectangle, Rectangle rectangle1) {
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle1.width;
            this.height = rectangle1.height;
        }

        public void initialize(Rectangle rectangle, Rectangle rectangle1, Rectangle rectangle2, Rectangle rectangle4) {
            initialize(rectangle2.top, rectangle4.left, rectangle2.width, rectangle.height);
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "top=" + top +
                    ", left=" + left +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle.initialize(10,20,40,60);
            System.out.println(rectangle.toString());

            Rectangle rectangle1 = new Rectangle();
            rectangle1.initialize(11,22);
            System.out.println(rectangle1.toString());

            Rectangle rectangle2 = new Rectangle();
            rectangle2.initialize(33, 66, 77);
            System.out.println(rectangle2);

            Rectangle rectangle3 = new Rectangle();
            rectangle3.initialize(rectangle1);
            System.out.println(rectangle3);
            rectangle3.initialize(rectangle2);
            System.out.println(rectangle3);

            Rectangle rectangle4 = new Rectangle();
            rectangle4.initialize(100, rectangle1);
            System.out.println(rectangle4);

            Rectangle rectangle5 = new Rectangle();
            rectangle5.initialize(rectangle3, 9,9);
            System.out.println(rectangle5);

            Rectangle rectangle6 = new Rectangle();
            rectangle6.initialize(rectangle, rectangle3);
            System.out.println(rectangle6);

            Rectangle rectangle7 = new Rectangle();
            rectangle7.initialize(rectangle3, rectangle1, rectangle2,rectangle5);
            System.out.println(rectangle7);

            Rectangle rectangle8 = new Rectangle();
            rectangle8.initialize(rectangle3.top, rectangle1.left, 3,5);
            System.out.println(rectangle8);
        }
    }

