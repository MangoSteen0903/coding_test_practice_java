package class_solution._06_sort;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int key = arr[j];
            while (j > 0 && arr[j] < arr[j - 1]) {
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
