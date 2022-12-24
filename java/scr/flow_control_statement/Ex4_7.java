package flow_control_statement;

public class Ex4_7 {
    public static void main(String[] args) {

        int num = 0;

        // 괄호 {}안의 내용을 n번 반복함
        //
        for (int i=1; i<=10; i++) {
//            System.out.println(Math.random()); // 0.0 <= 1.0
//            System.out.println(Math.random()*10); // 0.0 <= x < 10.0
//            System.out.println( (int)(Math.random()*10) ); // 0 <= x < 10 -> 0 ~9
            System.out.println( (int)(Math.random()*10)+1 ); // 1 <= x < 11 -> 1 ~ 10

//            System.out.println( (int)(Math.random()*11)-5 ); // -5 ~ 5
            // -5~5까지의 값을 구하고 싶으면?
            // 1. -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 = 11개
            // 2. System.out.println( (int)(Math.random()*11) );
            // 3. System.out.println( (int)(Math.random()*11)-5 );

        }
    }
}

// 곱하는 값 = 개별 값 개수
