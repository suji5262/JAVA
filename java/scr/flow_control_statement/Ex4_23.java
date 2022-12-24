package flow_control_statement;

public class Ex4_23 {
    public static void main(String[] args) {

        int i = 5;

        while (i-- != 0) {
            System.out.println(i + " - I can do it.");
        }
    }
}
// while 문도 반복횟수를 정해줄 수 있음
// 마지막 숫자가 0 = !0 -> 거짓이므로 반복문을 빠져나감
// 반복횟수를 모를때 쓴다곤 하지만 이렇게 쓸수도 있음!