package operator;

public class Ex3_18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000) / (1000.0);
        System.out.println(shortPi);

        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000));
        System.out.println(Math.round(pi*1000)/1000); // 3
        System.out.println(Math.round(pi*1000)/ 1000.0); // 3.142
        // 위에 연산을 쪼개서

        // 3.141을 얻으려면?
        System.out.println(pi);
        System.out.println((int)(pi*1000));
        System.out.println((int)(pi*1000)/1000.0);
    }
}
