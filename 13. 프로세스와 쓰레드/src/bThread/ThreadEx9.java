package bThread;

public class ThreadEx9 {
    public static void main(String[] args) throws Exception{
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        // ThreadGroup(ThreadGroup parent, String name)
        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

        grp1.setMaxPriority(3); // 쓰레드 그룹 grp1의 최대 우선순위를 3으로 변경
        // 쓰레드가 쓰레드 그룹에 추가되기 이전에 호출되어야 함

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000); // 쓰레드 1초간 멈추게 함
                } catch(InterruptedException e) {}
            }
        };

        // Thread(ThreadGroup tg, Runnable r, String name)
        new Thread(grp1, r, "th1").start();
        new Thread(subGrp1, r, "th2").start();
        new Thread(grp2, r, "th3").start();

        System.out.println(">>List of ThreadGroup : " + main.getName() + ", Active ThreadGroup: " + main.activeGroupCount() + ", Active Thread: " + main.activeCount());
        main.list();
        grp1.list();

    }
}
