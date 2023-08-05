package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class _32_ternary_system {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<Integer>();
        while (n > 0) {
            ternary.add(n % 3);
            n = n / 3;
        }
        int[] result = ternary.stream().mapToInt(i -> i).toArray();
        int length = result.length - 1;
        int index = 0;
        while (length >= 0) {
            answer += (int) (Math.pow(3, length) * result[index]);
            index++;
            length--;
        }
        return answer;
    }
}
