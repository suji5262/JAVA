package array;

import java.util.Arrays;

public class Ex5_2 {
    public static void main(String[] args) {

        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣음
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }

        System.out.println();

        System.out.println(Arrays.toString(iArr2)); // 문자열 - 랜덤값 출력
        System.out.println(Arrays.toString(iArr3)); // 문자열로 출력
        System.out.println(Arrays.toString(chArr)); // 문자열로 출력
        System.out.println(iArr3); // 주소값(주소값 비슷) 출력
        System.out.println(iArr2);
        System.out.println(iArr1); //
        // iArr1, 2, 3 -> 모두 값이 다름, 모두 서로 다른 배열임
        System.out.println(chArr); //문자로 출력
    }
}
