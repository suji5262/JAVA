package oop1;

public class Ex6_5 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
        System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");

        System.out.println();
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;
        // c1코드만 바뀌는 걸로 오해하기 쉽다 -> Card.width Card.height 이런식으로 써야함
        // cv 라서!

        System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
        System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");

    }



    static class Card {
        String kind;
        int number;
        static int width = 100;
        static int height = 250;
    }
}