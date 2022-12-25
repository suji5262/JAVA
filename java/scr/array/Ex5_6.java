package array;

public class Ex5_6 {
    public static void main(String[] args) {

        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; // 배열의 첫 번째 값으로 '최대값' 초기화
        int min = score[0]; // 배열의 첫 번째 값으로 '최소값' 초기화

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            } // 배열의 2번째 요소부터 읽기 위해 변수 i 의 값을 1로 초기화 함 -> score[0], score[1] 과 비교를 위해서

        } // for 문의 끝

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }// main 종료

} // class 종료

