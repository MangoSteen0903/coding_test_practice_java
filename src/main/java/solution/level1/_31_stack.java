package solution.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class _31_stack {
    public int[] solution(int[] arr) {
        ArrayList<Integer> sb = new ArrayList<Integer>();
        int[] stack = {arr[0]};
        for (int i = 1; i < arr.length; i++) {
            if (stack[0] != arr[i]) {
                sb.add(stack[0]);
                stack[0] = arr[i];
            }
        }
        sb.add(arr[arr.length - 1]);
        return sb.stream().mapToInt(i -> i).toArray();
    }
}
