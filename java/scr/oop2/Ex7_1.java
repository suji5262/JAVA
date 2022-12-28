package oop2;

public class Ex7_1 {
    public static void main(String[] args) {

        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; // 조상 클래스로부터 상속 받은 멤버
        ctv.channelUp(); // 조상 클래스로부터 상속 받은 멤버
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World");
        ctv.caption = true; // 캡션기능을 켬 -> 자막
        ctv.displayCaption("Hello, World");
    }
}

class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp () {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption; // 캡션상태 (on/ off)
    void displayCaption(String text) {
        if (caption) { // 캡션 상대가 on(true) 일 때만 text 를 보여줌
            System.out.println(text);
        }
    }
}
