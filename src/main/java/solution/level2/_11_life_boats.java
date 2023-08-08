package solution.level2;

import java.util.Arrays;

public class _11_life_boats {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int stack = 0;
        for (int person : people) {
            stack += person;
            if (stack >= limit) {
                stack = 0;
                answer += 2;
            } else if (limit - person < 40) {
                answer += 1;
            }
        }
        return answer;
    }
}
