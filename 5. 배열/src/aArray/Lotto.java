package aArray;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int[] lottoTarget = new int[45];

        for(int i = 0; i < lottoTarget.length; i++) {
            lottoTarget[i] = (int)(Math.random() * 45) + 1;
        }

        for(int i = 0; i < lottoTarget.length; i++) {
            int a = 0;
            int tmp = ((int)(Math.random() * lottoTarget.length) + 1) - 1;
            a = lottoTarget[tmp];
            lottoTarget[tmp] = lottoTarget[i];
            lottoTarget[i] = a;
        }

        for(int i : lottoTarget) {
            System.out.print(i + ",");
        }

        System.arraycopy(lottoTarget, 0, lotto, 0, lotto.length);

        for(int i : lotto) {
            System.out.println(i);
        }



    }
}
