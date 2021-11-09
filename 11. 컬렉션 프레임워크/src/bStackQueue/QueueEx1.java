package bStackQueue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // q에 5개까지만 저장

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input)) continue;
                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 도는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 "
                                        + MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i = 0; // 입력받은 명령어 저장
                    save(input);

                    //Linkedlist 내용 보여줌
                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q"))
            } catch(Exception e) {
                System.out.println("입력 오류입니다.");
            }
        } // while(true)
    } // main()

    private static void save(String input) {
        // queue에 저장
        if(!"".equals(input)) {
            q.offer(input);
        }

        // queue 최대크기 넘기면 제일 처음 입력된 것 삭제
        if(q.size() > MAX_SIZE) {
            q.remove();
        }
    }
} // end of class
