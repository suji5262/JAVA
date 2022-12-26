package oop1;

class Data {int x;}

public class Ex6_9 {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

        // 기본형 매개변수는 읽기만 가능 -> 값이 바뀌지 않음
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x); // change()의 값이 바뀐 것
    }
}
