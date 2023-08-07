package solution.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _02_min_acc_num {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }


}
