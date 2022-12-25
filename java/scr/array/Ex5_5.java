package array;

public class Ex5_5 {
    public static void main(String[] args) {

        int sum = 0; // 총점저장
        float average = 0f;  // 평균저장

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float)score.length; // 계산결과를 float 로 얻기 위해 형변환
        // double 로 해도 가능

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
