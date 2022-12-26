package oop1;

class Data2 { int x; }

public class Ex6_10 {
    public static void main(String[] args) {

        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d); // -> Data2 d
        System.out.println("After change(d)");
        System.out.println("main() : x = " +d.x);

    }

    static void change(Data2 d) { // 참조형 매개변수 -> 주소를 복사해와서 읽기 + 쓰기 가능
        d.x = 1000;
        System.out.println(("change() : x = " + d.x));
    }
}
