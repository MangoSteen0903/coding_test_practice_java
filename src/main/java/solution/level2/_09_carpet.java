package solution.level2;

public class _09_carpet {
    public int[] solution(int brown, int yellow) {
        int[] result = {};
        for (int i = 1; i < (brown + yellow) / 2; i++) {
            int a = (brown / 2) - i + 2;
            if (i >= a && a * i == brown + yellow && (i - 2) * (a - 2) == yellow) {
                result = new int[]{i, a};
                break;
            }
        }
        return result;
    }
}
