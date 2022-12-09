package date_time_and_formatting;

import java.sql.SQLOutput;
import java.util.Calendar;

public class ex10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance(); // 추상클래스는 인스턴스 생성불가

        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0=1월) : " +today.get(Calendar.MONTH));
        // month는 0부터 시작함으로 n+1을 해줘야함
        System.out.println("이 해의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE 와 DAY_OF_MONTH 는 같음
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));

        System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7), 1=일요일) : " + today.get(Calendar.DAY_OF_WEEK));
        // 1:일요일 2:월요일 3:화요일 .... 7:토요일

        System.out.println("오전_오후(0=오전, 1=오후) : " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11) : " +today.get(Calendar.HOUR));
        System.out.println("시간(0~23) : " +today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59) : " +today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나눔(1시간 = 60*60초)

        System.out.println("TimeZone(-12 ~ +12) : " + (today.get(Calendar.ZONE_OFFSET)/
                (60*60*1000)));
        // 한국은 => GMT 기준 +9시간 더빠름
        System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
        // 이달의 마지막 일을 찾음! - 자주 쓰니 알아야함!
    }
}
