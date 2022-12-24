package flow_control_statement;

public class GugudanEx {
    public static void main(String[] args) {

        for (int i = 2; i <= 9 ; i++) { // 2단 ~ 9단 까지
            for (int j = 1; j <= 9 ; j++) { // 1~9 까지 곱해라
                System.out.println(i + "*" + j + "=" + (i*j));
            }
            System.out.println();

        }
    }
}
