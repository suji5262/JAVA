package inheritance;

//class MyPoint1 {
//    int x;
//    int y;
//
//    String getLocation() {
//        return "x : " +x+ ", y : " + y ;
//    }
//}

//class MyPoint3D extends MyPoint1 {
//    int z;
//
//    String getLocation() {
//        return "x : " +x+ ", y : " + y + ", z : " +z;
//    } // 조상의 getLocation() 을 오버라이딩, 위 코드들 중(getLocation())에 오버라이딩 된 코드가 호출됨
//    // 조상 메서드가 호출되는게 아니라 자손 메서드가 호출됨
//}

//public class OverrideTest {
//    public static void main(String[] args) {
//        MyPoint3D p = new MyPoint3D();
//        p.x = 3;
//        p.y = 5;
//        p.z = 7;
//
//        System.out.println(p.getLocation());
//    }
//}

class MyPoint1 extends Object {
    int x;
    int y;

    MyPoint1(int x, int y) {
        this.x = x;
        this.y = y;
    } // 생성자 추가해주자!

    // Object 클래스의 toString() 을 오버라이딩
    // 오버라이딩을 하려면 선언부가 같아야함
    public String toString() {
        return "x : " +x+ ", y : " + y ;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        MyPoint1 p = new MyPoint1(4, 9);
//        p.x = 3;
//        p.y = 5;
        System.out.println(p.toString());
        System.out.println(p);
    }
}

