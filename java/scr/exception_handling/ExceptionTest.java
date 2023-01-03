package exception_handling;

public class ExceptionTest {
    public static void main(String[] args) {
            System.out.println(1);
            System.out.println(2);
            try {
                System.out.println(3);
                System.out.println(args[0]); // ArrayIndexOutOfBoundsException
                System.out.println(4); // 실행 x
            } catch (ArithmeticException ae) {
                if (ae instanceof ArithmeticException)
                    System.out.println("true");
                System.out.println("ArithmeticException"); // 여기까지만 실행하면 에러 발생 -> 실행 중 에러
                // 예외에 맞는 예외처리문이 x
//            } catch (ArrayIndexOutOfBoundsException e) {
            } catch (Exception e) { // 예외의 모든 조상이기에 가능함 - 그러나 가능하면 타입이 일치하는 예외처리문으로!
                System.out.println("ArrayIndexOutOfBoundsException");
            } // 예외에 맞는 예외처리문이 ok -> 에러가 뜨지 않음, 정상종료 됨
        System.out.println(6);
    }
}
// 이유를 모르는 예외처리문이 발생할 수도 있으니 Exception 예외처리문을 마지막에 넣는 것도 좋음
