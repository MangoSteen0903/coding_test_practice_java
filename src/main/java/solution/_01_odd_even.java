package solution;

public class _01_odd_even {
    //정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    public String odd_even_solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
