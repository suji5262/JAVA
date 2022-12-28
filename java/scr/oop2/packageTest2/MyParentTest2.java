package oop2.packageTest2;

import oop2.packageTest.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv); //에러 - 클래스 벗어남
//        System.out.println(dft); //에러 - 패키지벗어남
        System.out.println(prt); //ok - MyParent 의 자손
        System.out.println(pub); //ok
    }

} // protected 범위 (서로 다른 패키지, 자손클래스)

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); // 에러 접근범위 x - 클래스 밖
//        System.out.println(p.dft); //에러
//        System.out.println(p.prt); // 에러
        System.out.println(p.pub); //ok - 접근제한 x
    }
}
// public 범위 제한 x