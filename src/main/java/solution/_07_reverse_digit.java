package solution;

public class _07_reverse_digit {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        long temp = n;
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (temp % 10);
            temp /= 10;
        }
        return answer;
    }
}
