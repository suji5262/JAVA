package exception_handling;

public class Ex8_6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // 예외발생
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
        } // -> try_catch 의 끝

        System.out.println(6);
    }
}
// 모든예외의 최고 조상 -> Exception