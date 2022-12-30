package oop2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Ex7_15 {
    public static void main(String[] args) {

        Car c = new Car();
        FireEngine f = new FireEngine();
        FireEngine f2 = null;

//        f.water(); // 호출
//        c = f; // c = (Car)f;에서 형변환이 생략됨
////        c.water(); // 에러, car 타입의 참조변수로는 water()를 호출 할 수 없음
//        f2 = (FireEngine)c; //  자손타입 <- 조상타입 (형변환 생략 불가)
//        f2.water();

        // 형변환시 -> 실제 인스턴스가 무엇인지 중요하다
        FireEngine fe2 = (FireEngine) c; // 조상 -> 자손으로 형변환
        Car car2 = (Car) fe2;            // 조상 <- 자손으로 형변환
//        car2.drive(); // 위에 코드는 실행 중 에러가 남 -> nullPointerException (객체가 x -> null)


    }
} //  형변환은 실제 객체(가지고 있는 멤버 개수)가 중요함

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
