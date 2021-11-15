package aArray;

public class DimensionArray {
    public static void main(String[] args) {
        int[][] score = new int[4][3]; // 4행 3열

        int[][] arr = new int[][]{ {1, 2, 3}, {4, 5, 6} };
        int[][] arr2 = { {1, 2, 3}, {4, 5, 6} };
        int[][] arr3 = {
                             {1, 2, 3},
                             {4, 5, 6}
                        };

        int[][] score2 = new int[5][]; // 지정하지 않음
        score[0] = new int[4]; // ... 쭉 지정해줄 수 있음

    }
}
