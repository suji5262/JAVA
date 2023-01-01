package oop2;

class A1 {
    public void method(I1 i) {
        i.method();
    }
}

interface I1 {
    public void method();
}


class B1 implements I1 {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C1 implements I1 {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class InterFaceTest2 {
    public static void main(String[] args) {

        A1 a = new A1();
        a.method(new B1());
    } // class A를 안 바꿔도 됨 (변경에 용이)
}
