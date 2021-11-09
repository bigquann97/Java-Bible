package aProcessThread;

public class ThreadEx3 {
    public static void main(String[] args) throws Exception{
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
        t1.start();

        Thread.sleep(5000);
        System.out.println("main 1 종료");
        t1 = new ThreadEx3_1();
        System.out.println("main 2 종료");
    }
}

class ThreadEx3_1 extends Thread {
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
