package inheritance;

class Tv{
    boolean power;
    int channel;

    void power()       {power = !power;}
    void channelUp()   {++channel;}
    void channelDown() {--channel;}
} // 부모의 멤버가 5개

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
} //  자식멤버 2개
// 부모의 멤버를 상속받아 모든 멤버(자식의)는 7개

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();;

        System.out.println(stv.channel);

        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello, World");

    }
} // 부모 클래스를 주석처리하면 오류남
// 조상의 변경은 자손에 영향을 미침
