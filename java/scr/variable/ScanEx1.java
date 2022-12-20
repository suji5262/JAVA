package variable;

import java.util.Scanner; // 1. import 문 추가

public class ScanEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 2. Scanner 클래스의 객체 생성

//        int num = scanner.nextInt();
//        System.out.println(num);
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

        String input = scanner.nextLine(); // 라인단위로 입력
        int num3 = Integer.parseInt(input); // 문자가 아닌 숫자가 출력됨
        System.out.println(num3);


    } // 입출력 후에는 반듯이 닫아주는 코드가 필요함
}
