package solution.level2;

/*
1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
 */
public class _05_expression_num {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = i; j <= n; j++) {
                tmp += j;
                answer += tmp == n ? 1 : 0;
                if (tmp >= n) break;
            }
        }
        return answer;
    }
}
