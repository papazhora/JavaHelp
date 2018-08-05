package BoostBrain;

public class Classes {

    public static void main(String[] args) {
        Boll redBoll = new Boll();
        redBoll.color = "Red";
        redBoll.radius = 2.2;

        Boll greenBoll = new Boll();
        greenBoll.color = "Green";
        greenBoll.radius = 3;

        Box box = new Box();
        box.boll = redBoll;
        box.height = 5;
        System.out.println(box.boll.color);
        System.out.println(box.boll.radius);
        System.out.println(box.radius());
        System.out.println(box.volume());

        box.boll = greenBoll;
        System.out.println(box.boll.color);
        System.out.println(box.boll.radius);
        System.out.println(box.radius());

        Box bigBox = new Box();
        bigBox.height = 50;
        System.out.println(bigBox.volume());

        Box someBox = new Box(4, greenBoll);
        System.out.println(someBox.volume());
        System.out.println(someBox.boll.color);
        System.out.println(someBox.boll.radius);
        System.out.println(someBox.boll.toString());


    }
}

class Boll {
    double radius;
    String color;

    @Override
    public String toString() {
        return "Boll{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

class Box {
    double height;
    Boll boll;

    double radius() {
        return boll.radius;
    }
    double volume() {
        return height * height * height;
    }
    Box() {
        height = 3;  //конструктор
    }
    Box(double height, Boll boll) {
        this.height = height;
        this.boll = boll;
    }


}
