package oop1;

public class Ex6_24 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "automatic";
        c1.door = 4;

        Car c2 = new Car("blue", " manual", 6);

        System.out.println("cl의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("cl2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

    }
}

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
