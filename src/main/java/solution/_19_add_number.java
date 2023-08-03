package solution;

import java.util.Arrays;

public class _19_add_number {
    public int solution(int[] numbers) {
        int num = Arrays.stream(numbers).sum();
        return 45 - num;
    }
}
