package exception_handling;

public class Ex8_4 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) { // 예외가 발생하면 캐치문으로!
            System.out.println(5); // 실행되지 않음
        }

        System.out.println(6);
    }
}
// 예외발생 하지 않음