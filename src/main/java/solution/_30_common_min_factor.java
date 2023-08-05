package solution;

public class _30_common_min_factor {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int remain = 0;
        int product = n * m;
        while (m != 0) {
            remain = n % m;
            n = m;
            m = remain;
        }
        answer[0] = n;
        answer[1] = product / n;
        return answer;
    }
}
