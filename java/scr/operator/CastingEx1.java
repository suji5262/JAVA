package operator;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score = " + score);
        System.out.println("d = " + d); // 형변환 시 값을 읽기만 해서 변경되진 않음
    }
}
