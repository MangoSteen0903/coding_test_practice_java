package solution;

public class _14_collatz_conjecture {
    public int solution(long num) {
        int trialCount = 0;
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            if (trialCount == 500) return -1;
            trialCount++;
        }
        return trialCount;
    }
}
