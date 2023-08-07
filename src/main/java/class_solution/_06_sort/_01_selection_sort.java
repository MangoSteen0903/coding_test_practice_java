package class_solution._06_sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _01_selection_sort {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int key = arr[i];
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                min_index = arr[j] < arr[min_index] ? j : min_index;
            }
            if (arr[min_index] != key) {
                arr[i] = arr[min_index];
                arr[min_index] = key;
            }
        }
        return arr;
    }
}
