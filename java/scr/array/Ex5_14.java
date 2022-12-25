package array;

public class Ex5_14 {
    public static void main(String[] args) {

        String src = "ABCDE";// index 길이 -> 5 (0,1,2,3,4)

        char ch2 = src.charAt(0); // 문자열에서 한 문자 가져오기
        System.out.println(ch2);

        String str = src.substring(1,4); // 문자열의 일부 뽑기, index 길이 마지막 번호는 출력 x (1~4) -> 4는 x
        String str2 = src.substring(1); // (from ~) to를 생략하면 지정숫자부터 끝까지 나옴 (1~끝까지)
        // src.substring(1) == src.substring(1, src.length()->상수가 아닌 메서드) 와 같음
        System.out.println(str); // BCD
        System.out.println(str2); // BCDE


        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i); // src 의 i번째 문자를 ch에 저장
            System.out.println("src.charAt("+ i + ") : " + ch);
        }

        // String 을 char 로 변환
        char[] chArr = src.toCharArray();

        //char 배열(char[]을 출력)
        System.out.println(chArr);
    }
}
