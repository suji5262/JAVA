package flow_control_statement;

import java.util.Scanner;

public class Ex4_32 {
    public static void main(String[] args) {

        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {  //무한 반복문 - 사용자가 언제 끝낼지 모름
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0) ->");

            String tmp = sc.nextLine(); // 입력받은 내용 tmp 에 저장
            menu = Integer.parseInt(tmp);

            if (menu==0) { // 입력받은게 0 이면 종료
                System.out.println("프로그램을 종료합니다.");
                break; // while문을 빠져나감
            } else if (!(1 <= menu && menu <= 3)) { // 1~3까지의 숫자가 아닌경우
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue; // 입력을 받아야하니 다시 입력으로 돌아감
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다."); // 메뉴를 잘 입력했으면
        }
    }
}
