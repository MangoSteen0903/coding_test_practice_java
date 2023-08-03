package solution;

import java.util.ArrayList;
import java.util.Collections;

public class _16_divisor {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tempResult = new ArrayList<Integer>();
        int length = 0;
        for (int j : arr) {
            if (j % divisor == 0) {
                tempResult.add(j);
                length++;
            }
        }
        int[] result = new int[length];
        if (length == 0) {
            result = new int[1];
            result[0] = -1;
        } else {
            Collections.sort(tempResult);
            int index = 0;
            for (int j : tempResult) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }
}
