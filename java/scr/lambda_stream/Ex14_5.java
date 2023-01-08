package lambda_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100) +1; // 1~100사이의 난수
        Consumer<Integer> c = i -> System.out.print( i + ", ");
        Predicate<Integer> p = i -> i%2 == 0; // 짝수인지 검사
        Function<Integer, Integer> f = i -> i/10 * 10; // 1의 자리없애기 -> i값을 10나눈뒤, 10다시 곱하기

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list); // list 를 랜덤값으로 채움
        System.out.println(list);

        printEvenNum(p, c, list); // 짝수를 출력
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);


    }

    static <T> List <T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }


//    Consumer<Integer> c = i -> System.out.print( i + ", "); // 짝수를 출력
//    Predicate<Integer> p = i -> i%2 == 0; // 짝수인지 검사
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if (p.test(i)) // 짝수 검사
                c.accept(i); // i -> System.out.print( i + ", "); -> 화면에 i출력
        }
        System.out.println("]");
    }


    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // Supplier 로 부터 1~100의 난수를 받아 list 에 추가

        }
    }
}
