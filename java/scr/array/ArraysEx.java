package array;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4}; // 1차원 배열 arr
        int [][] arr2D = {{11, 12}, {21, 22}}; // 2자원 배열 arr2D

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D)); // 다차원 배열 출력시

        String [][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String [][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String [][] str2D3 = {{"aaa", "vvv"}, {"AAA", "BBB"}};


        System.out.println(str2D==str2D2);
        // 참조변수 값을 비교함 -> false(배열은 항상 비어있는 부분에 겹치게 만들수 없으므로 false 가 나옴)
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // 다차원 비교, true
        System.out.println(Arrays.deepEquals(str2D2, str2D3)); // false

        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr 을 복사해 새로운 arr2를 생성
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3); // arr 을 복사해 새로운 arr3를 생성
        System.out.println(Arrays.toString(arr3)); // 3개만 복사 (앞에서 부터)
        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(arr4)); // 7개복사 -> 배열의 범위를 넘으면 0으로 채움

        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr 의 배열 2~4번째 복사 -> 마지막은 출력 x(4는 출력x)
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {4, 2, 3, 0, 1};
        System.out.println(Arrays.toString(arr6)); // 정렬 전
        Arrays.sort(arr6); // 오름차순으로 정렬
        System.out.println(Arrays.toString(arr6)); // 정렬 후


    }
}
