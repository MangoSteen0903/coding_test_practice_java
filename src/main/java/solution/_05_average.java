package solution;

public class _05_average {
    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer / arr.length;
    }
}
