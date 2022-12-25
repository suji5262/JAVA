package array;

import java.util.Scanner;

public class ArrEx4 {
    public static void main(String[] args) {

        String[][] words = {
                {"chair", "의자"}, // words[0][0], words[0][1]
                {"computer","컴퓨터"}, // words[1][0], words[1][1]
                {"integer", "정수"} // words[2][0], words[2][1]
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); // [0](1행 물어보기-영어) -> 영어로 물어보기
             // Q -> 번호
            // %s -> 문자열

            String tmp = sc.nextLine(); // 한줄을 입력받음

            if (tmp.equals(words[i][1])) { // 문자열 비교
                System.out.printf("정답입니다.%n%n");
            } else  {
                System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n", words[i][1]);
                // words[i][1] -> [1](2행 물어보기- 한국어) 은 한국어 정답이 맞는지 볼려고

            }
        }
    }
}
