package collections_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {

        // 기본 길이(용량, capacity)가 10인 ArrayList 를 생성
        // ArrayList 에는 객체만 저장가능
        ArrayList list1 = new ArrayList(10);

        //Autoboxing 에 의해 기본형이 참조형으로 자동 변환
//        list1.add(new Integer(5));
        list1.add(5);
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //ArrayList(Collection c)와 같음
        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // sub 은 읽기만 가능함
        print(list1, list2);


        /*
         * 정렬하기
         */
        Collections.sort(list1); // list1 와 list2 를 정렬(오름차순)
        Collections.sort(list2); // Collections.sort(List 1)
        print(list1, list2);
        // Collection ->  인터페이스, Collections -> 클래스(유틸)


        /*
         * list2의 요소가 list1에 다 있는가?
         */
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));


        /*
         * 추가
         */
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 추가할 위치 지정
        print(list1, list2);


        /*
         * 변경
         * */
        list2.set(3, "AA");
        print(list1, list2);


        /*
         * indexOf() -> 지정된 객체의 위치(인덱스)를 찾음
         * */
        list1.add(0, "1");// -> String "1"을 index0 에 저장, "1"과 1은 다름
        System.out.println("index = " + list1.indexOf("1"));
        print(list1, list2);


        /*
         * 제거
         * */
        list1.remove(0); // String "1"을 삭제
        list1.remove(new Integer(1)); // 숫자 1을 삭제
        print(list1, list2);

        // list1에서 list2와 겹치는 부분 남기고 나머지 삭제(교집합)
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

//         list2에서 list1에 포함된 객체들을 삭제함
        for (int i = list2.size()-1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
