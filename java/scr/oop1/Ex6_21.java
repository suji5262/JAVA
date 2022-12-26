package oop1;

public class Ex6_21 {
    public static void main(String[] args) {

        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
        // mm.add(3, 3) -> 부분이 먼저 수행! 모든 부분의 연산이 끝나야 println 문이 수행되기에
        System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.print("mm.add(a) 결과 : " + mm.add(a));

    }

    static class MyMath3 {
        int add(int a, int b){
            System.out.print("int add(int a, int b) - ");
            return a + b;
        } // 이부분을 주석처리하면 mm.add(3, 3);에서 오류가 남 -> (int, int 값이 기에!)
        // ambiguous -> 어떤 값을 넣어야하는지 모호

        long add(int a, long b){
            System.out.print("long add(int a, long b) - ");
            return a + b;
        }

        long add(long a, int b){
            System.out.print("long add(long a, int b) - ");
            return a + b;
        }

        long add(long a, long b){
            System.out.print("long add(long a, long b) - ");
            return a + b;
        }

        int add(int[] a) {
            System.out.print("int add(int[] a) - ");
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i];
            }
            return result;
        }

    }
}
