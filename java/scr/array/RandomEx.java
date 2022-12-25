package array;

import java.util.Arrays;

public class RandomEx {
    public static void main(String[] args) {

        int[] numArr = {0, 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10); // 0~9까지의 한 값을 임의로 얻음

            int tmp = numArr[0]; // 두 값을 바꾸기 위해 넣은 변수
            numArr[0] = numArr[n];
            numArr[n] = numArr[0];
            // 두 수 바꾸기!
        }
        System.out.println(Arrays.toString(numArr)); // 섞인 숫자 출력
    }
}
