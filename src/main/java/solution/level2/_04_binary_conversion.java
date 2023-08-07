package solution.level2;

import java.util.Arrays;

public class _04_binary_conversion {
    public int[] solution(String s) {
        int[] answer;
        int conversion_count = 0;
        int zero_count = 0;
        int current_length = s.length();
        while (current_length > 1) {
            int tmp = 0;
            for (char str : s.toCharArray()) {
                tmp += str == '0' ? 1 : 0;
            }
            current_length -= tmp;
            s = Integer.toBinaryString(current_length);
            current_length = s.length();
            conversion_count++;
            zero_count += tmp;
        }

        answer = new int[]{conversion_count, zero_count};
        return answer;
    }
}
