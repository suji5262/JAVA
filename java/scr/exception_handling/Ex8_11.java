package exception_handling;

public class Ex8_11 {
    public static void main(String[] args) {

//        throw new Exception(); // -> 예외처리 필수라 에러발생
        // Exception 과 그 자손은 반듯 예외처리를 해줘야함(필수)

        throw new RuntimeException();
        // 예외처리 선택 -> 컴파일시 에러가 발생하기 않으나 실행하면 런타임에러 발생
        // RuntimeException 과 그 자손은 예외처리 하지 않아도 컴파일이 됨(선택)
    }
}
