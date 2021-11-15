package bRepeat;

public class WhileEx {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            System.out.print(i);
            if (i % 10 % 3 == 0 && i % 10 != 0) {
                System.out.print("짝");
                if(i / 10 % 3 == 0) {
                    System.out.print("짝");
                }
            }
            System.out.println();
        }
    }
}
