package flow_control_statement;

public class Ex4_8 {
    public static void main(String[] args) {


//        for (int i =1; i<=3; i++) { // 괄호 {}안의 문장을 3번 반복
            // 1부터 3까지 1씩증가

//            for (int i =1; i<=10; i=i+2) { // i = 1, 3, 5. 7. 9, 11(포함x) ...
//               // 괄호 {}안의 문장을 5번(1, 3, 5, 7, 9) 반복


//        for (int i =10; i>=1; i--) {
//                System.out.println(i);
//        }


//        for (int i =10; 1>=1; i--) { // 무한반복 예시
//            System.out.println(i);
//        }


//        for (int i=1, j=10; i<=10; i++, j--) { // 변수를 하나 더 쓸수 있음(타입이 같아야함)
//            System.out.println("i = " + i + ", j = " + j); // i가 1~10까지 증가하는 동안 j는 10~1까지 감소
//        }

//        int i; // scope(범위) - 변수의 범위(좁을수록 좋음) / 선언위치부터 선언된 블럭의 끝까지
//
//        for (i=1; i<=10; i++) { // int i를 for 문 밖에서 쓰고 싶다면! i를 밖으로 꺼내면 됨!
//            System.out.println("i = " + i);
//        }

        int i = 1; // scope(범위) - 변수의 범위(좁을수록 좋음) / 선언위치부터 선언된 블럭의 끝까지

        for (;true;) { // 괄호 {} 안의 문장을 생략하면 true 로 간주됨, 조건식이 항상 참이니 무한반복이 됨
            System.out.println("i =" + i);
        }
//        System.out.println(i); // 위에 문장이 무한반복되며 이 코드까지 내려올 수 없어서 에러


    }
}
// 미리 예측하고 실행해보는게 좋음!
// for 문은 '무한반복'에 빠질 수 있으니 조건식을 조심해서 써야함!