package flow_control_statement;

public class Ex4_30 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (true) { //(while 문은 true 를 생략불가!) 무한 반복문
            if (sum > 100) { // 이 조건을 만족하면
                break; // 자신이 속한 하나의 반복문을 벗어남
            }
            ++i;
            sum += i;
        } // while 문 끝


//            while (sum <= 100) {
//                ++i;
//                sum += i;
//                } // 위 코드와 동일


//        for (;;) { // for 문은 -> for(;true;) {}, true 생략가능
//            if (sum > 100)
//                break;
//
//            ++i;
//            sum += i;
//        } // for 문으로 바꿀 수 있음

            System.out.println("i = " + i);
            System.out.println("sum = " + sum);

    }
}
