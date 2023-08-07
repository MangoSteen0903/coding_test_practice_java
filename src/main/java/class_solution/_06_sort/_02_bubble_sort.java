package class_solution._06_sort;

public class _02_bubble_sort {
    public int[] solution(int n, int[] arr) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int key = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = key;
                }
            }
        }
        return arr;
    }
}
