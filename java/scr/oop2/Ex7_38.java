package oop2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_38 {
    public static void main(String[] args) {

        Button b = new Button("Start");
        b.addActionListener(new ActionListener() { // 클래스의 저으이와 객체 생성을 동시에
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });

    }
}
