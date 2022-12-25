package array;

public class Ex5_18 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        int sum = 0;

//        for (int i = 0; i < score.length; i++) { // score.length : 4
//            for (int j = 0; j < score[i].length; j++) { // score[i].length : 3
//                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
//
//                sum += score[i][j];
//            } // 2차원 배열은 이중 for 문 이여야 함
//
//        } // 모두 12번 돔, 4*3 = 12

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            } // 향상된 for 문으로 2차원 배열의 모든 요소를 읽어오는 방법을 보여주기 위해 출력과 합계를 따로 처리

        } // 위의 코드와 동일한 코드

        System.out.println("sum = " + sum); // 배열의 모든 합
    }
}
// i 가 0~3까지 도는 동안, j는 0,1,3 -> 0,1,2 -> 0,1,2 이렇게 돔