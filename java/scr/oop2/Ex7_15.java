package oop2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Ex7_15 {
    public static void main(String[] args) {

        Car c = new Car();
        FireEngine f = new FireEngine();
        FireEngine f2 = null;

        f.water(); // 호출
        c = f;
//        c.water(); // car 타입의 참조변수로는 water()를 호출 할 수 없음
        f2 = (FireEngine)c;
        f2.water();

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!~~");
    }
}

class FireEngine extends Car {

    void water() {
        System.out.println("water!!!~~");
    }
}
