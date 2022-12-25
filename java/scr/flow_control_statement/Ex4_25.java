package flow_control_statement;

import java.util.Scanner;

public class Ex4_25 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        System.out.print("숫자를 입력하시오.(예 : 12345) ->");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); // 입력받은 내용을 tmp 에 저장
        num = Integer.parseInt(tmp);
        sc.close();

        while (num!=0) {
            //num 을 10으로 나눈 나머지를 snm 에 더함
            sum += num%10;
            System.out.printf("sum = %3d, num = %d%n", sum, num);

            num /= 10; // num = num/10; num 을 10으로 나눈값을 다시 num 에 저장
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
