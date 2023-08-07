package solution.level1;

import java.util.Arrays;
import java.util.Objects;

public class _15_find_index {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (Objects.equals(seoul[i], "Kim")) {
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }
        return answer;
    }
}
