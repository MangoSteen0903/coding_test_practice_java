package solution;

import java.util.Arrays;

public class _34_budget {
    public int solution(int[] d, int budget) {
        int[] sortedArray = Arrays.stream(d).sorted().toArray();
        int b = budget;
        int result = 0;
        for (int i = 0; i < d.length; i++) {
            b -= sortedArray[i];
            if (b < 0) break;
            result++;
        }
        return result;
    }
}
