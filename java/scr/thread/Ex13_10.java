package thread;

class Ex13_10 {
    public static void main(String[] args) {
//        RunImplEx10 r = new RunImplEx10();
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend(); // 쓰레드 th1을 일시정지
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume(); // 쓰레디 th1이 다시 동작(재개)
            Thread.sleep(3000);
            th1.stop(); // 쓰레드 th1을 강제종료
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {}
    } // main
}

/*class RunImplEx10 implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}*/

class MyThread implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

//    volatile boolean suspended = false; // 변수 타입이 쉽게 바뀐다 > 변수
//    volatile  boolean stopped = false; // 쉽게바뀌는 값이닌까 복사본 쓰지 말고 원본에서 가져다가 써라
// cpu 의 코어들이 메모리에 있는 값을  - 복사본을 사용하지 않고 원본을 사용
    Thread th;

    MyThread(String name) {
        th = new Thread(this, name); // Thread(Runnable r, String name)
    }

    void start() {
        th.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }

    void resume() {
        suspended = false;
    }

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

