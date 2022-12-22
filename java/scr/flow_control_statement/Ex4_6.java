package flow_control_statement;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {

        System.out.printf("현재 월을 입력하세요. ->");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break; // 여기서 브레이크를 지울경우 3,4,5월을 입력할 경우 다음 출력문까지 내려가서 같이 출력됨
//            case 3: case 4: case 5:
//                System.out.println("현재 계절은 봄입니다.");
//                break; // 이렇게 써도됨 - 코드가 너무 길어질 때 간략하게 씀

            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다.");
               break;

            default:
//            case 12:
//            case 1:
//            case 2: // 12, 1, 2 월을 뺀 나머지 계절을 모두 값을 넣어줘서 디폴트로 해도됨
                System.out.println("현재 계절은 겨울입니다.");
        }
    } // main 의 끝
}
