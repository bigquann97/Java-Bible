package aProcessThread;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("main 종료");
    }
}

class ThreadEx2_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}