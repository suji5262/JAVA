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
