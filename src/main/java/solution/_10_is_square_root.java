package solution;

public class _10_is_square_root {
    public long solution(long n) {
        if (Math.pow(Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return (long) -1;
    }
}
