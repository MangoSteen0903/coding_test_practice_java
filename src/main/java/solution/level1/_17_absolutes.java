package solution.level1;

public class _17_absolutes {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += !signs[i] ? absolutes[i] * -1 : absolutes[i];
        }
        return answer;
    }
}
