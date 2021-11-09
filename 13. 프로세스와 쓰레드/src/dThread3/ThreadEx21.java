package dThread3;

public class ThreadEx21 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000; // private가 아니면, 외부에서 직접 접근 가능해 아무리 동기화 해도 값 변경 막을 길 없음

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) { // synchronized 추가
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
        }
    }

    // public void withraw(int money) {
    //      synchronized(this) {
    //          if(balance >= money) {
    //              try { Thread.sleep(1000); } catch {Exception e) {}
    //              balance -= money;
    //          }
    //      }
    // }
}

class RunnableEx21 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300 중 한 값 임의로 선택해 출금
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:" + acc.getBalance());
        }
    }
}
// 한 쓰레드가 if문의 조건식을 통과하고 출금하기 바로 직전에 다른 쓰레드가 끼어들어 출금을 먼저 했기 때문