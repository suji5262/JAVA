package exception_handling;

public class Ex8_5 {
    public static void main(String[] args) {

        System.out.println("가");
        System.out.println("나");

        try {
            System.out.println("다");
            System.out.println(0/0); // 예외발생
            System.out.println("라");
        } catch (ArithmeticException e) {
            System.out.println("마");
        }
        System.out.println("바");
    }
}
// 예외가 발생한 경우
// 발생한 예외의 캐치블럭만 수행하고 빠져나옴