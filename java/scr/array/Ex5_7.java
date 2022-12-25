package array;

import java.util.Arrays;

public class Ex5_7 {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i; // 배열을 0~9의 숫자로 초기화
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻음
            int tmp = numArr[0]; // 두 값을 바꾸기 위해 넣은 변수
            numArr[0] = numArr[n];
            numArr[n] = numArr[0];
            // 두 수 바꾸기!
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
