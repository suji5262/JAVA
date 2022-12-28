package oop2;

public class OverrideTest2 {
    public static void main(String[] args) {

        Point3 p3 = new Point3(7,8);
        System.out.println(p3);


//        Point3 p3 = new Point3();
//        p3.x = 7;
//        p3.y = 8;
//        System.out.println("p3.x = " + p3.x);
//        System.out.println("p3.y = " + p3.y);
        // 이 코드를 위에 코드로 간결하게 바꿀 수 있음
    }

}


class Point3 {
    int x;
    int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString() 을 오버라이딩
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}