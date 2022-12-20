package variable;

public class PrintfEx1 {
    public static void main(String[] args) {
        System.out.println(10/3); // 정수 나누기 정수라서 > 정수값으로 출력
        System.out.println(10.0/3); // 한쪽이라도 실수형이면 >  실수값이 출력

        System.out.printf("%d%n", 15);
        System.out.printf("%o%n", 15);
        System.out.printf("%x%n", 15);
        System.out.printf("%#x%n", 15);
        System.out.printf("%s%n", Integer.toBinaryString(15));

        float f = 123.456789f; // 정밀도가 7자리 - 나머지숫자는 의미 없음
        double f2 = 123.456789;  // 정밀도가 15자리
        System.out.printf("%f%n", f);
        System.out.printf("%f%n", f2);
        System.out.printf("%e%n", f2);
        System.out.printf("%g%n", f2);

        System.out.printf("[%5d]%n", 10); // 5자리 중에 10만 출력(오른쪽정렬)
        System.out.printf("[%-5d]%n", 10); // 왼쪽정렬
        System.out.printf("[%05d]%n", 10); // 공백 대신 0으로 채움
        System.out.printf("[%5d]%n", 1234567); // 5자리 이상 값을 채우면 5자리만 나오는게 아니라 다 출력됨

        double d = 1.23456789;
        System.out.printf("%f%n", d); // 7자리만 출력, 마지막 숫자는 반올림
        System.out.printf("%14.10f%n", d); // 14자리가 출력 > 정수부분은 공백, 소수점 뒤자리는 0으로 채워짐
        System.out.printf("%14.6f%n", d);
        // 소수점 뒤 6자리숫자가 다 출력됨, 마지막은 반올림 - 보여지는것만 저장된 값은 변하지않음
        System.out.printf("%.6f%n", d); //정수 부분은 다 출력, 소수점만 6자리 출력됨

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com"); // 오른쪽 정렬, 나머지부분 공백
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com"); // 앞에서부터 10자리를 잘라 출력됨, 문자열 일부만 출력가능

        byte b = 1;
        short s =2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_00L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // 8진수 10, 10진수로는 8
        int hexNum = 0x10; // 16진수 10, 10진수로는 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("b = %d%n", b); // 정수
        System.out.printf("s = %d%n", s); // 정수
        System.out.printf("c = %c, %d%n", c, (int)c); // 문자 + 유니코드
        System.out.printf("finger = [%5d]%n", finger); // 우측정렬(5숫자 만큼의 길이)
        System.out.printf("finger = [%-5d]%n", finger); // 좌측정렬(5숫자 만큼의 길이)
        System.out.printf("finger = [%05d]%n", finger); // 5숫자 만큼의 길이 중 빈칸은 0으로 채워짐
        System.out.printf("big = %d%n", big); // 정수
        System.out.printf("hex = %#x%n", hex); // 접두사까지 같이 출력 > #(접두사가 출력됨)
        System.out.printf("octNum = %o, %d%n", octNum, octNum); // 8진수 + 정수(10진수)
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum); // 16진수 = 정수
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum); // 정수는 2진수로 변환해 문자열로 반환 + 정수

    }
}
