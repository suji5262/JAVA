package oop1;

public class Ex6_1 {

    public static void main(String[] args) {

        Tv t; // 변수 t를 선언
        t = new Tv(); // 인스턴스 생성
        t.channel = 7;// 멤보변수 channel 의 값을 7로
        t.channelDown(); // 메서드 호출 -> channelDown()
        System.out.println("현재 채널은 " + t.channel + " 입니다.");

    }

     static class Tv {

            //Tv의 속성(멤버변수)
            String color;
            boolean power;
            int channel;

            //Tv의 기능(메서드)
            void power() {power = !power;}
            void channel() { ++channel; }
            void channelDown() { -- channel; }

    }
}
