package flow_control_statement;

import java.util.Scanner;

public class Ex4_28 {
    public static void main(String[] args) {

        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
//        System.out.println("answer = " + answer); // answer 의 값을 미리 알 수있음
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요 ->");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 입력하세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 입력하세요.");
            }
        } while (input != answer);
        System.out.println("★★★★정답입니다!★★★★");
    }
}
