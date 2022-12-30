package oop2;

import java.util.Vector;

class Product2 {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스점수

    Product2(int price) {
        this.price = price;
        bonusPoint = 0;
    }
    public Product2() {} // 기본생성자
}

class Tv3 extends Product2 {
    Tv3() { super(100);}

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {super(200);}

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() {super(50);}

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000; //소유금
    int bonusPoint = 0; // 보너스점수
    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용 될 vector 객체

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p); // 구입한 제품을 vector 에 저장
        System.out.println(p + " 을/를 구입하셨습니다.");
    }

    void refund(Product2 p) { // 구입한 제품 환불
        if (item.remove(p)) { // 구입한 vector 에서 제거
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " 을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여줌
        int sum = 0; // 구매한 물품의 합계
        String itemList = " "; // 구매한 물품목록

        if (item.isEmpty()) { // vector 가 비어있는지 확인
            System.out.println("구입하신 물품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product2 p = (Product2) item.get(i);
            sum += p.price;
            itemList += (i==0) ? " " + p : ", " + p;
        }

        System.out.println("구입하신 물품의 총 금액은" + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");
    }
}



public class Ex7_23 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv3 tv = new Tv3();
        Computer2 com = new Computer2();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();

        b.refund(com);
        b.summary();
    }
}
