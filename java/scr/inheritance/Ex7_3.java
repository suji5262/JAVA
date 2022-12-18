package inheritance;

public class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10; // super.x와 this.x 둘 다 가능함
}

class Child2 extends Parent2 {

    void method() {
        System.out.println("x = " +x); // 조상 x - 자신의 x가 없으니, 조상멤버이기도 자기멤버이기도 하닌까
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
