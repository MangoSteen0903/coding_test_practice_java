package solution.level2;

public class _06_next_big_num {
    public int solution(int n) {
        int answer = 0;
        int tmp = n + 1;
        String tmp_str = "";
        int binary_count = Integer.toBinaryString(n).replace("0", "").length();
        while (tmp_str.length() != binary_count) {
            tmp_str = Integer.toBinaryString(tmp).replace("0", "");
            tmp++;
        }

        return tmp - 1;
    }
}
