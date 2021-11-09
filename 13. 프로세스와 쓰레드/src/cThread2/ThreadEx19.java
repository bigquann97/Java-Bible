package cThread2;

public class ThreadEx19 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();

        th1.start();
        th2.start();

        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}
        // join 사용 않으면, main 바로 종료되었겠지만, join으로 th1 th2 작업 기다려줌
        System.out.print("소요시간 : " + (System.currentTimeMillis() - ThreadEx19.startTime));
    }
}

class ThreadEx19_1 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    } // run ()
}

class ThreadEx19_2 extends Thread{
    public void run() {
        for(int i = 0; i < 300; i ++) {
            System.out.print(new String("|"));
        }
    }
}