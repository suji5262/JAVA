package lambda_stream;

interface  MyFunction1 {
    void run();
}

public class Ex14_1 {

    // 람다식을 매개변수로 해서 호출
    static void execute(MyFunction1 f) { // 매개변수 타입이 MyFunction 인 메서드
        f.run();
    }

    static MyFunction1 getMyFunction() {
//        MyFunction1 f = () -> System.out.println("f3.run()");
//        return f;
        return () -> System.out.println("f3.run()"); // 위 코드를 한 줄로 줄임
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction 의 run()을 구현
        MyFunction1 f1 = () -> System.out.println("f1.run()");

        MyFunction1 f2 = new MyFunction1() {
            public void run() {
                System.out.println("f2.run()");
            }
        };

//        MyFunction1 f3 = getMyFunction();
        MyFunction1 f3 = () -> System.out.println("f3.run()");
        // 위 함수를 호출하려면 위에 run()을 사용해야 함

        f1.run();
        f2.run();
        f3.run();

        execute(f1); // MyFunction1 f1 = () -> System.out.println("f1.run()"); 직접넘김
        execute( () -> System.out.println("run()") ); // 람다식을 직접 넘김

    }
}
