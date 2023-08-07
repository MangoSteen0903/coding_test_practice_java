package solution.level1;

import java.util.Arrays;

public class _35_powerset {
    public int solution(int[] number) {
        int answer = 0;
        int[] sortedList = Arrays.stream(number).sorted().toArray();
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    answer += sortedList[i] + sortedList[j] + sortedList[k] == 0 ? 1 : 0;
                }
            }
        }
        return answer;
    }
}
