package cThread2;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        ThreadEx12.delay(1000);
        System.out.print("<<main>> 종료");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i ++) {
            System.out.print("-");
        }
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i ++) {
            System.out.print("|");
        }
        System.out.print("<<th2 종료>>");
    }
}