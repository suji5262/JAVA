package oop2.packageTest;

//class MyParent{ // 접근제어자 default - 같은 패키지 안에서만 쓸수 있음
public class MyParent { // 접근제어자가 public
    private int prv; // 같은 클래스
    int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; //  접근제한 x

    public void printMembers() {
        System.out.println(prv); //ok
        System.out.println(dft); //ok
        System.out.println(prt); //ok
        System.out.println(pub); //ok
    } //private 범위 (같은 class)

}


//public class MyParentTest {

class MyParentTest { // 접근제어자 default
    public static void main(String[] args) {

        MyParent p = new MyParent();
//        System.out.println(p.prv); // 에러 접근범위 x - 클래스 밖
        System.out.println(p.dft); //ok
        System.out.println(p.prt); //ok
        System.out.println(p.pub); //ok
    }

} // default 범위 (같은 package)
