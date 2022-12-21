package operator;

public class UsualArithmeticConversionEx {
    public static void main(String[] args) {

        int a = 1_000_000; // 1,000,000 1백만, 10의 6제곱
        int b = 2_000_000; // 2,000,000 2백만, 10의 6제곱
        // int a+b = 10의 12제곱 > int의 범위 10의9제곱

//        long c = a*b; // 결과가 int
        long c = (long)a*b; // 올바른 연산결과가 나옴, 결과값 중 하나에 형변환을 해줘야함

        System.out.println(c); // 오버플로우 발생
    }
}
