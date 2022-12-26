package oop1;


public class Ex6_2 {

     static class Tv {
        String color;
        boolean power;
        int channel;

        void power()       {power = !power;}
        void channelUp()   {++channel;}
        void channelDown() {--channel;}
    }

    static class TvTest2 {
        public static void main(String[] args) {

            Tv t1 = new Tv();
            Tv t2 = new Tv();
            // t1, t2는 같은 객체가 아님
            System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
            System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

            t1.channel = 7;
            System.out.println("t1의 channel 값을 7로 변경했습니다.");

            System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
            System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

            t2 = t1; // 참조변수 t1에 t2의 값을 저장
            System.out.println("참조변수 t1의 값을 t2에 저장합니다.");

            System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
            System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

        }
    }

}



