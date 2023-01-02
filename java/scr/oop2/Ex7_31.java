package oop2;

import java.sql.SQLOutput;

class Ex7_31 {
    class InstanceInner {
//    static void int cd = 100;  // 에러, static 변수를 선언얼 수 없음
        final static int CONST =100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200; // static 클래스만 static 가능!
    }

    void Method() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300; // 에러, static 변수를 선언얼 수 없음
            final static int CONST = 300;
        }
        int i = LocalInner.CONST;
    }


    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST); - 지역 내부 클래스는 메서드 내에서만 사용가능 함
    }
}
// 상수는 static 사용 가능!