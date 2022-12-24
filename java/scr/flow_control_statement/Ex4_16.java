package flow_control_statement;

public class Ex4_16 {
    public static void main(String[] args) {

        // 별찍기(5열*10행)

//        System.out.println("**********");
//        System.out.println("**********");
//        System.out.println("**********");
//        System.out.println("**********");
//        System.out.println("**********"); // 가장 간단한 방법

//        // i = 1, 2, 3, 4, 5번 {}괄호안의 내용을 반복
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println("**********");
//        } // 위 코드와 같음(더 간결)


        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("*"); // 10개 찍고
            } // 안쪽 for 문 먼저 실행되고 밖깥 for 문 실행
            System.out.println(); // 줄바꿈
        } //  위 코드와 일치 (더 간결)


        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= i; j++) { // i와 같이 1씩 늘어나게 찍으려면!
                System.out.printf("*");
            }
            System.out.println(); // 줄바꿈
        }

    }
}
