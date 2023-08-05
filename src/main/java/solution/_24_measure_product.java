package solution;

public class _24_measure_product {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right + 1; i++) {
            int count = count_measure(i);
            answer += count % 2 == 0 ? i : i * -1;
        }
        return answer;
    }

    private int count_measure(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            count += n % i == 0 ? 1 : 0;
        }
        return count + 1;
    }
}
