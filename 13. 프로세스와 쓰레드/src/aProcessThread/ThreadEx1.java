package aProcessThread;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // Thread의 자손 클래스의 인스턴스를 생성

        Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스를 생성
        Thread t2 = new Thread(r, "Hi"); // 생성자 Thread(Runnable target)
        Thread t3 = new Thread();
        
        // Thread t2 = new Thread(new ThreadEx1_2()); - 위 두줄을 간단히

        t1.start(); // 쓰레드 t1 실행
        t2.start(); // 쓰레드 t2 실행

        t1 = new ThreadEx1_1(); // 다시 생성해서 쓰레드 실행 - 두번 호출시 IllegalThreadStateException
        t1.start();

    }
}

class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
            // Thread t = Thread.currentThread();
            // String name = t.getName();
            // System.out.println(name);
            // 을 줄여쓴게 위
        }
    }
}