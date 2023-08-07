package class_solution._06_sort;

public class _03_insertion_sort {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int key = arr[j];
            while (j >= 0 && arr[j] < arr[j - 1]) {
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j--;
            }
        }
        return arr;
    }
}
