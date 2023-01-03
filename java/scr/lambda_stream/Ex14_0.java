package lambda_stream;

public class Ex14_0 {
    public static void main(String[] args) {

//        Object obj = (a, b) -> a > b ? a : b; // 람다식, 익명객체
//       Object obj = new Object() {
//            int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

//        MyFunction obj = new MyFunction() {
//           public int max(int a, int b) { // 오버라이딩 -> 접근 제어자는 좁게 못 바꿈
//                return a > b ? a : b;
//            }
//        };
        // 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 함
        MyFunction f = (a, b) -> a > b ? a : b; // 람다식, 익명객체(위에 코드가 간결해짐)

//        int value = obj.max(3, 5); // Object 클래스에는 max()가 없음 -> 함수형 인터페이스가 필요함
        int value = f.max(5, 9);
        System.out.println("value = " + value);

    }
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함
interface MyFunction{
//    public abstract int max(int a, int b);
    int max(int a, int b);
//    public abstract int max2(int a, int b); // 2개는 에러남 -> 에너테이션 덕분애 컴파일러가 확인해줌

}
