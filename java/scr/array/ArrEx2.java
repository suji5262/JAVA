package array;

public class ArrEx2 {
    public static void main(String[] args) {

        // index 범위가 0~n-1 -> 0~4
        int[] arr = new int[5]; // 길이가 5인 int 배열 arr 을 생성
        System.out.println("arr.length = " +arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] =" + arr[i]); // ★배열의 모든요소를 출력★

        }



//        // index 범위가 0~n-1 -> 0~4
//        int[] arr2 = new int[5]; // 길이가 5인 int 배열 arr 을 생성
//        System.out.println("arr.length = " +arr2.length);
//
//        for (int i = 0; i < 6; i++) {  // ★index 범위를 벗어나 에러가 발생★
//            System.out.println("arr[" + i + "] =" + arr2[i]); // ★배열의 모든요소를 출력★
//
//        }
    }
}
