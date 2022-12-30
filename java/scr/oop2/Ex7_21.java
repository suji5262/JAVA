package oop2;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
    }
}

class Tv2 extends Product {
    Tv2() {
        //조상클래스의 생성자 Product(int price)를 호출
        super(100); // tv의 가격의 100만원으로 함
        // object 클래스의 toString()을 오버라이딩
    }
        public String toString() {
            return "Tv";
    }

}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer { // 물건을 사는 사람, 고객, customer
    int money = 1000; //소유금
    int bonusPoint = 0; // 보너스점수

    void buy(Product p) { // new Tv2, Computer() -> 둘다 들어올 수 있음
        if (money < p.price) { // 소지금이 판매금보다 적을 때
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 빼기
        // 판매금에서 소지금을 뺀 가격을 다시 소지금 가격으로 -> 계산이 끝난 금액을 다시 소지금으로
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가

        System.out.println(p.toString() + " 을/를 구입하셨습니다.");
        System.out.println(p + " 을/를 구입하셨습니다.");
        // 둘다 같은 코드
    }
}


public class Ex7_21 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Tv2();
        b.buy(p); // -> 밑에코드를 풀어쓴것
//        b.buy(new Tv2());
        // 참조변수 없이 넣을 수 있음 (buy(Product p) 메서드 덕분), 참조변수 없으면 main 메서드 안에서 사용불가
        b.buy(new Computer());
        // buy(Product p) 메서드 이용 -> 물건사기

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 bonus point는 " + b.bonusPoint + "점입니다.");

    }
}


