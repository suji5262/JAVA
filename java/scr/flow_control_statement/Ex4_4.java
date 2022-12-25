package flow_control_statement;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {

        int score = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 초기화

        System.out.println("<점수를 입력하세요.>");
        Scanner sc1 = new Scanner(System.in);
        score = sc1.nextInt(); // 화면을 통해 입력반은 숫자를 score 에 저장

        if (score > 90) { // score 가 90점 보다 높으면 A
            grade = 'A';
        } else if (score >= 80) { // score 가 80점 보다 높으면 B
            grade = 'B';
        } else if (score <= 70) { // score 가 70점 보다 높으면 C
            grade = 'C';
        } else {
            grade = 'D'; // 모두 아니면
        }

        System.out.println("당신의 학점은 " + grade + "입니다");
    }

}
        
        
        
//       int score1 = 0; // 점수를 저장하기 위한 변수
//        char grade1 = 'D'; // 학점을 저장하기 위한 변수, 공백으로 초기화
//
//        System.out.println("<점수를 입력하세요.>");
//        Scanner sc2 = new Scanner(System.in);
//        score1 = sc2.nextInt(); // 화면을 통해 입력반은 숫자를 score 에 저장
//
//        if (score1 > 90) { // score 가 90점 보다 높으면 A
//            grade1 = 'A';
//        } else if (score1 >= 80) { // score 가 80점 보다 높으면 B
//            grade1 = 'B';
//        } else if (score1 <= 70) { // score 가 70점 보다 높으면 C
//            grade1 = 'C';
//        }
//
//        System.out.println("당신의 학점은 " + grade1 + "입니다");
//    }
//
//    // 마지막 else 를 없애고 grade 에 'D'를 디폴트값으로 넣어줌*/
//    }


