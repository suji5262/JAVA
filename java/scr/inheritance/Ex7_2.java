package inheritance;

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
class Parent {
    int x = 10; // super.x (조상)
}

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("x = " +x); // 가까운쪽 값이 나옴
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
// 이름이 같아도 구별이됨


