package bThread;

public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis(); // time stamp - 시작할때 찍기
        for(int i = 0; i < 100; i++) {
            System.out.printf("%s", new String("-")); // JVM 힙 영역 - 새롭게 계속 생성됨
            // "-" - Heap 영역 String constant pool에 한번 저장됨
        }
        System.out.println("소요시간1:" + (System.currentTimeMillis() - startTime1)); // time stamp - for문 실행후 시간 빼기 처음 시작 시간

        System.out.println("현재시간: " + System.currentTimeMillis());
        System.out.println();

        long startTime2 = System.currentTimeMillis(); // 다시 time stamp - for문 시작 전 찍기
        for(int i = 0; i < 5000; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2:"+(System.currentTimeMillis() - startTime2)); // 두번째 for문 끝난 후 실행시간 빼기 첫 번째 for문 시작 시간
        System.out.println("현재시간: " + System.currentTimeMillis());

    }
}
