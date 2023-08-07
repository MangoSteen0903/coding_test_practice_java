package solution.level1;

public class _12_harshad_number {
    public boolean solution(int x) {
        int length = Integer.toString(x).length();
        int sum = 0;
        int temp = x;
        for (int i = 0; i < length; i++) {
            sum += temp % 10;
            temp /= 10;
        }
        return x % sum == 0;
    }
}
