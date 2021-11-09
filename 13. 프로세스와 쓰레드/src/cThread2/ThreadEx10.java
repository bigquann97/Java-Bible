package cThread2;

public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); // start 호출 전 실행되어야함
        t.start();

        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
            if(i == 5) {
                autoSave = true;
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch(InterruptedException e) {
            }
            if(autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업 파일이 자동 저장되었습니다.");
    }
}
