package flow_control_statement;

public class Ex4_31 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
// 1~10까지 숫자중에 3의 배수는 넘겨- 제외해라