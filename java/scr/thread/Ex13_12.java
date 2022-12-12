package thread;

class Ex13_12 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start(); // ThreadGroup 에 의해 참조되므로 gc 대상이 아님
        new Thread(r).start(); // ThreadGroup 에 의해 참조되므로 gc 대상이 아님
    }
}

class Account {
    private int balance = 1000; // private 으로 해야 동기화가 의미 있음

    public synchronized int getBalance() {
        return balance;
    } // 읽을때 쓸 때 모두 동기화 해줘야함

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            balance -= money;
        } // synchronized 동기화를 해줘야 음수로 안떨어짐 - 임계영역
    } // withdraw
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임이로 선택해 출금(withdraw)
            int money = (int)(Math.random() * 3 +1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    } // run()
}
