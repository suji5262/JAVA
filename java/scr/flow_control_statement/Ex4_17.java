package flow_control_statement;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {

        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요 -> ");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); // 입력한 내용을 tmp 에 저장

        num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
