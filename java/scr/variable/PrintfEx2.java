package variable;

public class PrintfEx2 {
    public static void main(String[] args) {

        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        // %f =부동소수점방식(소수6자리까지만 출력, 7자리는 반올림) , %e = 지수형식, %g = 값을 간략하게 표현
        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);

        System.out.printf("d = %f%n", d); // 마지막 자리 반올림 - 부동소수점방식이라서
        System.out.printf("d = %14.10f%n", d); // 전체 14자리 중 소수점 10자리 출력
        System.out.printf("d = %014.10f%n", d); // 위에 값에 빈자리를 0으로 채움

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url); // 20개 문자열 출력, 빈곳은 빈문자열로 출력(우측정렬)
        System.out.printf("[%-20s]%n", url); // 20개 문자열 출력, 빈곳은 빈문자열로 출력(좌측정렬)
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
    }
}
