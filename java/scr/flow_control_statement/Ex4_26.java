package flow_control_statement;

public class Ex4_26 {
    public static void main(String[] args) {

       int sum = 0;
       int i = 0;
       // i 를 1씩 증가시켜서 sum 을 계속 더해나감

       while (sum <= 100) { // sum 이 100을 안 넘을 때까지
           System.out.printf("%d - %d%n", i, sum);
           sum += ++i; // i 를 계속 증가시킴, 더한 값이 sum 에 누적됨
       }


        int sum = 0;
        int i = 0;
        // i 를 1씩 증가시켜서 sum 을 계속 더해나감

        while ((sum += ++i) <= 100) { // sum 이 100을 안 넘을 때까지
            System.out.printf("%d - %d%n", i, sum);
//            sum += ++i; // 아예 조건식에 집어넣으면 더 깔끔한 코드가 됨
        } // 위 코드와 동일값이나옴
    }
}
// 1씩더하는데 몇까지 더해야 sum 이 100을 넘는지?
