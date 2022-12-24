package flow_control_statement;

public class Ex4_12 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++)
            System.out.println(i); // i의 값을 출력
        // 출력문이 하나밖에 없는경우 {}괄호 생략가능

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i); // print() -> 가로로 출력
        }
    }
}
