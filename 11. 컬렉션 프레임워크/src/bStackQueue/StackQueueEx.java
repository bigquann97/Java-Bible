package bStackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack(); // Stack 클래스로 자바 내 구현 되어 있음
        Queue q = new LinkedList(); // Queue 인터페이스 구현체인 LinkedList사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while(!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
