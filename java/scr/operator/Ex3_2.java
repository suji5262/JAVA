package operator;

public class Ex3_2 {
    public static void main(String[] args) {

        int i = 5, j = 0;

        j = i++; // 후위형
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
        // j = i;
        // i++;
        // 이런식으로 분리해서 생각해라

        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        i = 5;
        j = 0;

        j = ++i; // 전위형
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
        // ++i > 증가를 1시키고
        // j = i > 대입해라
    }
}
