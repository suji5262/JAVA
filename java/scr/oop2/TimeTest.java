package oop2;

class Time {
    private int hour; // 0~23 사이의 값
    private int minute; // 0~59사이의 값
    private int second; // 0~59사이의 값

    public void setHour(int hour) {
        if (isValidHour(hour))
            return;

        this.hour = hour;
    }

    //매개변수로 넘겨진 hour 가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    } // 이 class 안에서만 쓰임 - 확인해야할 범위가 좁혀지는데 테스트하기에 편함

    public int getHour(){
        return hour;
    }
} // private 으로 바꿔서 관리하자

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 100;
        t.setHour(21); // hour 의 값을 21로 변경
        System.out.println("Hour = " + t.getHour());
        t.setHour(100); // 100이 들어와도 21이 안바뀜
        System.out.println("Hour = " + t.getHour());

    }
}
