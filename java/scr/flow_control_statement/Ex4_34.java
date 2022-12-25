package flow_control_statement;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Ex4_34 {
    public static void main(String[] args) {

        int menu = 0, num = 0;

        Scanner sc = new Scanner(System.in);

        outer : // 줄 바꿔서 써도 무방
        while (true) {  //무한 반복문
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0) ->");

            String tmp = sc.nextLine(); // 입력받은 내용 tmp 에 저장
            menu = Integer.parseInt(tmp); // tmp 숫자로 변환

            if (menu==0) { // 입력받은게 0 이면 종료
                break; // while 문을 빠져나감
            } else if (!(1 <= menu && menu <= 3)) { // 1~3까지의 숫자가 아닌경우
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue; // 입력을 받아야하니 다시 입력으로 돌아감
            }

            for (;;) {
                System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99) ->");
                tmp = sc.nextLine();
                num = Integer.parseInt(tmp);

                if (num==0)
                    break;
                if (num==99)
                    break outer;

                switch (menu){
                    case 1:
                        System.out.println("result = " + num*num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            } // for 문의 끝

            System.out.println("선택하신 메뉴는 " + menu + "번입니다."); // 메뉴를 잘 입력했으면
        } // while 문의 끝
        System.out.println("프로그램이 종료되었습니다.");
    } // main 의 끝
}
