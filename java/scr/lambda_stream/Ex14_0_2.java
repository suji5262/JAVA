package lambda_stream;

public class Ex14_0_2 {
    public static void main(String[] args) {

//        Object dbj = (a, b) -> a > b ? a : b; // 람다식, 익명객체
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a: b;
            }
        };
        // 자바에서는(규칙) 메서드만 존재 x

//        int value = obj.max(3, 5); // 함수형 인터페이스가 필요
    }
}

// 타입이 필요함!
