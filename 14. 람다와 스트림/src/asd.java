import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 구해야 하는 것 : 사람의 덩치 등 수
 * 키와 몸무게를 비교하여 둘 다 크면 덩치가 크고 둘 중 하나의 값만 크면 같은 등수
 *
 */

public class asd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            // 등수는 1부터 시작
            int rank = 1;
            for (int j = 0; j < n; j++) {
                // 자신보다 키와 몸무게 둘 다 클 경우 등수 +1
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}