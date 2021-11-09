import java.io.*;
import java.util.ArrayDeque;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.peekFirst());

        for (int k=0; k<n; k++) {
            String line = br.readLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            if (cmd.equals("push_front")) {
                int num = Integer.parseInt(s[1]);
                queue.offerFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = Integer.parseInt(s[1]);
                queue.offerLast(num);
            }  else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                } else {
                    bw.write("-1");
                    bw.write(10);
                    System.out.println(queue.peekFirst().getClass());
                }
                bw.write("\n");
            } else if (cmd.equals("size")) {
                bw.write(65);
                bw.write(65);
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.write("\n");
            } else if (cmd.equals("pop_front")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(queue.pollFirst());
                }
                bw.write("\n");
            } else if (cmd.equals("pop_back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(queue.pollLast());
                }
                bw.write("\n");
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(queue.peekLast());
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}