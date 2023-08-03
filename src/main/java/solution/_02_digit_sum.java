package solution;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
public class _02_digit_sum {
    public int solution(int n) {
        int answer = 0;
        int temp = n;
        int count = Integer.toString(n).length();
        while (temp > 0) {
            int digit = (int) ((int) temp / Math.pow(10, count - 1));
            answer += digit;
            temp -= (int) (digit * Math.pow(10, count - 1));
            count--;
        }
        return answer;
    }
}
