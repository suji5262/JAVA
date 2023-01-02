package oop2;

class Ex7_33 {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private 멤버도 접근가능함
        int iiv2 = outerCv;
    }

    static class StaticInner {

//        int siv = outerIv; // 스타틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없음
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0; // 값이 바뀌지 않는 변수는 = 상수로 간주 -> 값을 바꾸면 바로 에러남 liv3
        int LV = 0;

        class LocalInner { // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
            int liv = outerIv;
            int liv2 = outerCv;

            // 외부 클래스의 지역변수는 final 이 붙은 변수(상수)만 접근 가능
            int liv3 = lv; // 에러!(JDK 1.8부터 에러 x)
            int liv4 = LV; // OK
        }

    }
}

// 1. 외부 클래스의 private 멤버도 접근가능함
// 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
