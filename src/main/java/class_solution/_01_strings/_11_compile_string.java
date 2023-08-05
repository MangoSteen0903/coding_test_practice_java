package class_solution._01_strings;

public class _11_compile_string {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s + " ";
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            count++;
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (count > 1) {
                    answer.append(s.charAt(i - 1)).append(count);
                } else {
                    answer.append(s.charAt(i - 1));
                }
                count = 0;
            }
        }
        return answer.toString();
    }
}
