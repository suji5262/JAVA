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


        for (int i =10; i>=1; i--) {
            System.out.println(i);
        }


    }
}
// 미리 예측하고 실행해보는게 좋음!
// for 문은 '무한반복'에 빠질 수 있으니 조건식을 조심해서 써야함!