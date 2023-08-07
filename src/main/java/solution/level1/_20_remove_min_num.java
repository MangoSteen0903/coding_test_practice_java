package solution.level1;

import java.util.Arrays;
import java.util.OptionalInt;

public class _20_remove_min_num {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = Arrays.stream(arr).min().orElse(0);
        answer = Arrays.stream(arr).filter(num -> num != min).toArray();
        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
