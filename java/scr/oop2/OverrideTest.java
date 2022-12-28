package oop2;

public class OverrideTest {
    public static void main(String[] args) {

        Point3D p = new Point3D();
        p.x = 1;
        p.y = 2;
        p.z = 3;
        System.out.println(p.getLocation());

        Point2 p2 = new Point2();
        p2.x = 5;
        p2.y = 10;
        System.out.println(p2.toString());
        System.out.println(p2); // 위에 코드를 간단히

    }
}

class Point2 {
    int x;
    int y;

    String getLocation() {
        return "x : " + x + ", y : " +y; //입력했을 때 x, y 값만 출력됨
    }

}

class Point3D extends Point2 {
    int z;

    String getLocation() { // 조상의 getLocation 을 오버라이딩
        return "x : " + x + ", y : " +y + ", z : "+ z; // 압력하면 x, y, z값이 출력됨
    }
}
// 상솓받은 오버라이딩이 출력됨
// 상속받은 오버라이딩은 나에게 맞게 수정가능함