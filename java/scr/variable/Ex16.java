package variable;

public class Ex16 {
    public static void main(String[] args) {

        String str = "3";

        System.out.println(str.charAt(0) - '0');
        // 문자열을 문자로 > charAt(0);, '3' - '0' = 3(숫자) > 문자에서 '0'을 빼면 숫자로

        System.out.println('3' - '0' + 1);
        // 문자 '3' - '0' = 3(숫자) > 3+1=4

        System.out.println(Integer.parseInt("3") + 1);
        //문자열 "3" > 숫자 3으로!, 3 + 1 = 4

        System.out.println("3" + 1);
        // 문자열 + 숫자 = 문자열 > "3" + 1 = "3" + "1" + "4"

        System.out.println(3 + '0');
        // 숫자 + 0 = 문자, 문자를 숫자로 더한것임, but 값이 3이 아님 > 형변환을 해야됨
        // '0' 은 숫자로 48
        System.out.println((char)(3 + '0')); // 문자 '3'
    }
}
