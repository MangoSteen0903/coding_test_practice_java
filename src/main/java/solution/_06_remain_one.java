package solution;

public class _06_remain_one {
    public int solution(int n) {
        int answer = 1;
        while (answer < n) {
            if (n % answer != 1) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
