package flow_control_statement;

public class Ex4_33 {
    public static void main(String[] args) {

        Loop1 : for (int i = 2; i <= 9; i++) { // 이름을 붙여서 쓰면 하나 이상의 반복문을 탈출할 수 있음
            for (int j = 1; j <= 9; j++) {
                if (j==5)
                    break Loop1;
//                break;
//                continue Loop1;
//                continue;
                System.out.println(i + "*" + j + "=" + i*j);
            } // end of for i
            System.out.println();
        } // end of Loop1
    }
}
