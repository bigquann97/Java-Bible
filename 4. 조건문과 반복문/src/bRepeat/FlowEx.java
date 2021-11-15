package bRepeat;

import java.util.Scanner;

public class FlowEx {
    public static void main(String[] args) {
        int num = 0;
        char star = '*';
        Scanner scanner = new Scanner(System.in);

        System.out.println("반복하고싶은 별 라인을 쓰세요");
        String a = scanner.nextLine();
        num = Integer.parseInt(a);

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }



    }
}