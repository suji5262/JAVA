package array;

import java.util.Arrays;

public class ArrEx3 {
    public static void main(String[] args) {

        int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int 배열
        System.out.println(iArr); // -> iArr 의 주소값이 찍임

        for (int i = 0; i < iArr.length; i++) { // 배열의 저장된 값을 출력
            System.out.println(iArr[i]);
        }

        System.out.println(Arrays.toString(iArr)); // 더 간단하게 출력 -> 문자열로 반들어 반환함
    }
}
