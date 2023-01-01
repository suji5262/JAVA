package oop2;

abstract class Unit1 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract -> 예외없이
    void move(int x, int y); // public abstract 가 생략
    void attack(Fightable f); // public abstract 가 생략
}

class Fighter extends Unit1 implements Fightable {
    // 오버라이딩 규칙 = 조상(public)보다 접근제어자 범위가 좁으면 안됨
    public void move(int x, int y) { // public 을 붙이지 않으면 -> 디폴트
        System.out.println("[" + x + ", " + y + "]로 이동");
    }
    public void attack(Fightable f) {
        System.out.println(f + "를 공격");

    }

    // 싸울 수 있는 상대를 불러옮
    Fightable getFightable() {
        Fighter f = new Fighter(); // Fighter 를 생성해서 반환
        return (Fightable)f;
//        Fightable f = new Fighter(); // Fighter 를 생성해서 반환
//        return f;
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();



//        Unit1 u = new Fighter();
//        Fightable f = new Fighter();
//        u.move(100, 300);
////        u.attack(f2);// -> toString 호출, Unit1 에는 attack() 이 없어서 호출 불가
//        u.stop();
//
//        f.move(100, 300);
//        f.attack(f);// -> toString 호출
////        f.stop(); // Fightable 에는 stop() 이 없어서 호출 불가
    } // 인터페이스로도 다형성 가능
}
