package oop2;

class AA { // AA는  BB의 외부 클래스
    int i = 100;
    BB b = new BB();

    class BB { //BB는 AA의 내부 클래스
        void method() {
//            AA a  = new AA();
//            System.out.println(a.i);
        System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능 -> AA의 멤버가 된것
            // 외부클래스 멤버에 바로 접근가능
        }

    }
}

//class CC {
//    BB b = new BB();
//}

public class InnerTest {
    public static void main(String[] args) {
//        BB b = new BB();
//        b.method();

    }
}
// AA 객체를 먼저 생성한 후 BB를 사용할 수 있음
