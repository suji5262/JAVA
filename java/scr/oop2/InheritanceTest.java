package oop2;

public class InheritanceTest {
    public static void main(String[] args) {

        Circle c = new Circle();
//        c.x = 1;
//        c.y = 2;
//        c.r = 3;
        // 상속

        c.p.x = 1;
        c.p.y = 1;
        c.r = 1;
        // 포함

//        System.out.println("c.p.x = " + c.x);
//        System.out.println("c.p.y = " + c.y);
//        System.out.println("c.r = " + c.r);
        // 상속

        System.out.println("c.p.x = " + c.p.x);
        System.out.println("c.p.y = " + c.p.y);
        System.out.println("c.r = " + c.r);
        // 포함

        System.out.println(c.toString()); // object 클래스의 기본 메서드(11개 있음) -> 문자열 반환 (객체의 주소값이 나옴- oop2.Circle@6aaa5eb0)
        Circle c2 = new Circle();
        System.out.println(c2.toString());// oop2.Circle@3498ed -> 각 개체마다 주소값이 다름
        System.out.println(c2); // println 기능 - oop2.Circle@3498ed -> 위의 코드를 간단히
    }
}

class  Point extends Object { //  부모가 없는 class -> extends Object 를 자동으로 추가함
    int x;
    int y;
}

//class Circle extends Point {
//    int r;
//} // 상속

class Circle { // extends Object 를 자동으로 추가함
    Point p = new Point(); // 참조변수 초기화
    int r;

//    Point p2;
//    Circle() {
//        p2 = new Point();
//    } // 처음에 초기화 하지 않으면 기본 생성자로 초기화 해야함

} // 포함