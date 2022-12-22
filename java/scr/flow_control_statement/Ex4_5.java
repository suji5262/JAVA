package flow_control_statement;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ', opt = '0';

        System.out.printf("점수를 입력하세요. ->");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // 화면을 통해 입력반은 숫자를 score 에 저장

        System.out.printf("당신의 점수는 %d 입니다. %n", score);

        if (score >= 90) { // score 가 90점 보다 같거나 높으면 A(grade)
            grade = 'A';
            if (score >= 98) { // 90점 이상 중에서도 98점 이상은 A+
                opt = '+';
            } else if (score < 94) { // 90점 이상 94점 미만은 A-
                opt = '-';
            }
        } else if (score >= 80) { // score 가 80점 보다 같거나 높으면 B(grade)
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) { // score 가 70점 보다 같거나 높으면 C(grade)
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            grade = 'D'; // 모두 아니면
        }

        System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);
    }
}
