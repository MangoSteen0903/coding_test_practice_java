package class_solution._02_array;

import java.util.ArrayList;

public class _01_large_number {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pivot = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > pivot) answer.add(arr[i]);
            pivot = arr[i];
        }
        return answer;
    }
}
