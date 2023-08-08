package solution.level2;

public class _07_fibonacchi {
    public long solution(int n) {
        long[] memo = new long[10000];
        memo[1] = 1;
        memo[2] = 1;
        for (int i = 3; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }
        return memo[n];
    }
}
