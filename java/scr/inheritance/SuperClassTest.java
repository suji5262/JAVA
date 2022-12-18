package inheritance;

public class SuperClassTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
    }
}

class Point1 {
    int x, y;

//    Point1(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    Point1(int x, int y) {
        super(); // Object(); - 생성자가 하나 있기때문에 기본생성자를 안 넣어줌
        this.x = x;
        this.y = y;
    }

    public Point1() {

    } // 방법 1 - 기본생성자를 추가

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
} // 클래스를 만들 때 기본생성자 작성은 필수!

class Point3D extends Point1 {
    int z;

    Point3D(int x, int y, int z) {
//        super();  // Point()를 호출
//        this.x = x;
//        this.y = y;
//        this.z = z;
        super(x, y);  // 방법 2 - 조상의 생서자 Point(int x, int y, int z)를 호출
        this.z = z;
    }

    String getLocation() { // 오버라이딩
        return "x : " + x + ", y : " + y + ", z :" + z;
    }
}
