//package oop2;
//
//class A {
//        public void method(I i) { // 인터페이스 I를 구현한 넘들만 들어와라
//        i.method();
//    }
//
////    public void method(B b) {
////        b.method();
////    }
//
////    public void method(C b) { // C를 사용할면 여기도 바꿔야함, main 메서드와 이곳 두곳을 바꿔야함
////        b.method();
////    } //main 메서드와 이곳 두곳을 바꿔야함
//}
//
//
//// B, C의 선언과 구현을 분리
//interface I { // method() 의 선언
//    public void method();
//}
//
//
//class B interface I { // method() 의 구현
//    public void method() {
//        System.out.println("B 클래스의 메서드");
//    }
//}
//
//
////class C interface I {
////    public void method() {
////        System.out.println("C 클래스의 메서드");
////    }
////}
//
//public class InterFaceTest {
//    public static void main(String[] args) {
//
//        A a = new A();
////        a.method(new B()); // A가 B를 사용(의존)
//        a.method(new B()); // A가 C를 사용(의존)
//
//
//    }
//}
