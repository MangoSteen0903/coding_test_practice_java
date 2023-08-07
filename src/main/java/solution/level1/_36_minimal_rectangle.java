package solution.level1;

import java.util.Arrays;

public class _36_minimal_rectangle {
    public int solution(int[][] sizes) {
        int maxColumn = 0;
        int maxRow = 0;
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (sizes[i][1] > sizes[i][0]) {
                    int size0 = sizes[i][0];
                    int size1 = sizes[i][1];
                    sizes[i][1] = size0;
                    sizes[i][0] = size1;
                }

                maxColumn = Math.max(sizes[i][0], maxColumn);
                maxRow = Math.max(sizes[i][1], maxRow);
            }
        }
        return maxColumn * maxRow;
    }
}
