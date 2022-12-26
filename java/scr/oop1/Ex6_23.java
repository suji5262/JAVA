package oop1;

public class Ex6_23 {
    public static void main(String[] args) {

        Data1_1 d1 = new Data1_1();
        Data1_2 d2 = new Data1_2(); //  기본 생성자가 없을 경우 -> compile error 발생 -> 기본생성자가 없어서
    }
}

class Data1_1 {
    int value;
//    Data1_1() {}; // -> 주석처리해도 에러 x
} // 기본 생성자가 자동으로 추가 -> 컴파일러 (아무 생성자도 없는경우)

class Data1_2 {
    int value;

    Data1_2() {}; // 주석처리시 에러생김
    // 클래스를 만들 때 꼭 기본생성자를 추가해야함

    Data1_2(int x) {
        value = x;
    } // 매개변수가 있는 생성자
}