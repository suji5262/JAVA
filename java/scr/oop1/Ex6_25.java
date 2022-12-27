package oop1;

public class Ex6_25 {
    public static void main(String[] args) {
        MyCar c = new MyCar();
        MyCar c2 = new MyCar("blue");

        System.out.println("c1의 color = " + c.color + ", gearType = " + c.gearType + ", door = " + c.door);
        System.out.println("c1의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class MyCar {
    String color;
    String gearType;
    int door;

    MyCar() {
    this("red", "auto", 6);
    }

    MyCar(String color) {
        this(color, "auto", 6);
    }

    MyCar(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
