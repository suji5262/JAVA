package variable;

import java.sql.SQLOutput;

public class Ex2_3 {
    public static void main(String[] args) {
        final int score = 100; // 가능하면 상수를 선언과 동시에 초기화하는 것이 좋음
//        final int score; // 지역변수는 반드시 초기화해야함
//
//        score = 200;
        System.out.println(score);

        boolean power = false;
//        boolean power = 0; // 타입이 맞지 않아 에러

//        byte b = 128; // -128~127
        byte b = 127; // -128~127

        int oct = 010; // 진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16

        long l = 1000_000_000;
//        long l2 = 1000_000_000_000; // 범위를 넘어가서 접미사 L을 붙여야함
        long l2 = 1000_000_000_000L;

        Float f = 3.14f;
        double d = 3.14f; // 타입불일치하여도 에러는 안남 큰것에 작은것이 들어갈 수 있음

        char ch = 'A'; // 문자형은 문자가 하나도 없거나 둘이상이면 에러발생
        int i = 'A'; // 문자의 유니코드

        String str = ""; // 빈 문자열(empty string)
        String str2 = "ABCD"; //여러문자 가능
        String str3 = "123";
        String str4 = str2 + str3;

        System.out.println(power);
        System.out.println(b);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(l);
        System.out.println(l2);
        System.out.println(f);
        System.out.println(d);

        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f); // 접미사는 출력 x
        System.out.println(1e3);

        System.out.println(ch);
        System.out.println(i);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(""+7+7); // 앞에 7일 먼저 문자열로 변환 > 뒤 7도 문자열로 변환 > 77
        System.out.println(7+7+""); // 앞에 두 숫자 7을 먼저 연산하고 > 뒤 문자열과 결합 > 14
        // 어떤 타입의 변수도 문자열과 덧셈연산을 하면 그 결과가 문자열이 됨
    }
}
