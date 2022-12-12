package thread;

class ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

//        try {
////            th1.sleep(2000);  // 이렇게 쓰면 오해가능 - main 쓰레드가 잠이든다(코드를 실행하는건 메인)
//            Thread.sleep(2000); // 이렇게 써야 보다 편함
//        } catch (InterruptedException e) {}
//
//        System.out.print("<< main 종료 >>");
//    } // main
//} // 쓰레드가 3개있음 (main, th1, th2)
        delay(2 * 1000);
        System.out.println("<< main 종료 >>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("_");
        System.out.print("<< th1 종료 >>");
    } // run()
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("|");
        System.out.print("<< th2 종료 >>");
    } // run()
}