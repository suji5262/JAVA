package inheritance;

class MyPoint extends Object {
    int x;
    int y;
}
// 최고조상 - Object
// 조상이 없는경우 컴파일해보면 위의 코드처럼 Object 가 상속되어있음

class MyCircle {
    MyPoint p = new MyPoint();
    int r;

    MyCircle() {
        p = new MyPoint();
    }
}

public class InheritanceTest2 {
    public static void main(String[] args) {
        MyCircle c = new MyCircle();
        System.out.println(c.toString()); // "MyCircle@6a5fc7f7" - 문자열을 반환
        System.out.println(c); // 간단히 쓸수 있음(toString) - println 의 기능, "MyCircle@6a5fc7f7"

        MyCircle c2 = new MyCircle();
        System.out.println(c2.toString()); // "MyCircle@3b6eb2ec"
    }
}
