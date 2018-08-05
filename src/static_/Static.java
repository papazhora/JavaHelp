package static_;

public class Static {

    public static void main(String[] args) {
        Person.age = 68;
        Person.name = "Egor";
        System.out.println(Person.age);
        System.out.println(Person.name);

        Person.age = 99;
        Person.name = "XXXX";
        System.out.println(Person.age);
        System.out.println(Person.name);

        Person.initialize("uuuu", 88);
        System.out.println(Person.name);
        System.out.println(Person.age);


    }
}



class Person {
    public static String name;
    public static int age;

    public static void initialize(String name1, int age1) {
        name = name1;
        age = age1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

