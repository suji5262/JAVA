package oop2;

public class AbstractTest {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank() ,new Dropship()}; // 배열의 생성과 초기화를 한번에
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();
        // 위 코드와 동일함

//        Object[] group = new Unit[3]; // .move 를 찾을 수 없음, 에러발생
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();

        // group 의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
//        group[0].move(100, 200);
//        group[1].move(100, 200);
//        group[2].move(100, 200); // 아래코드와 동일
        for (int i = 0; i < group.length; i++) {
            group[i].move(500, 450);
        } // 위 코드를 간결하게 for문으로

    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {/* 현재 위치에 정지 */}
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }
    void stimPack() {/* 스팀팩을 사용함 */}
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }

    void changeMode() {/* 공격모드를 변환 */}
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x = " + x + ", y = " + y + "]");
    }
    void load() {/* 선택된 대상을 태움 */}
    void unload() {/* 선택된 대상을 내려줌 */}

}


