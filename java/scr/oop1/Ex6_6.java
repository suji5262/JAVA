package oop1;

public class Ex6_6 {
    public static void main(String[] args) {

        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L); // 더하기
        long result2 = mm.subtract(5L, 3L); // 빼기
        long result3 = mm.multiply(5L, 3L); // 곱하기
        double result4 = mm.divide(5L, 3L); // 나누기

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);

        long result = mm.max(890, 345); // 둘 중에 큰 값을 반환하는 메서드
        System.out.println("두 수중에 더 큰값은? = " + result);
        long result5 = mm.min(234, 345); // 둘 중에 작은 값을 반환하는 메서드
        System.out.println("두 수중에 더 작은값은? = " + result5);

        //구구단 호출 메서드
        mm.printGugudan(4); // -> 4단 출력
        System.out.println();
        mm.printGugudan(14); // 14단 출력 -> 2~9단이 아니라 출력 x
    }
}

    class MyMath {
        long add(long a, long b) {
            long result = a + b;
            return  result;
            // return a + b  // -> 위 코드를 간단히 한줄로 가능
        }

        long subtract(long a, long b) {return a - b;}
        long multiply(long a, long b) {return a * b;}
        double divide(double a, double b) {return a / b;}

        // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성
        long max(long a, long b) {
            long result = 0; // 더 큰값이닌까 -> long 타입으로
//            if (a>b) { // 조건식이 참일 때 반환
//                result = a;
//            } else{ // 조건식이 거짓일 때 반환
//                result = b; // 거짓일 때 반환값을 쓰지 않으면 에러생김
//            }
//            result = a > b ? a: b; // 삼항 연산자 -> 더 간단함
            return a > b ? a: b; // -> 더 간단하게 쓸수 있음
        }

        long min(long a, long b) {
            long result = 0;
            return a < b ? a : b;
        }// 더 작은 값을 반환하기


        void printGugudan(int dan) {
            for (int i = 1; i <= 9; i++) {
                if (!(2 <= dan && dan <= 9))
                    return; // 입력받은 단(dan)이 2~9단이 아니면 메서드 종료후 돌아감
                System.out.printf("%d * %d = %d%n", dan, i, dan * i);
            }
            // reture; 생략
    }

}

