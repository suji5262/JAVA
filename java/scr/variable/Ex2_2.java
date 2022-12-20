package variable;

public class Ex2_2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x = " +x+ " y = " + y);

        tmp = x; // 1. x의 값을 tmp에 저장
        x = y; // 2. y의 값을 x에 저장
        y = tmp; // 3. tmp의 값을 y에 저장

        System.out.println("x = " +x+ " y = " + y);
        System.out.println(x);
        System.out.println(y);

    } // 두 변수의 값을 바꾸기
}
