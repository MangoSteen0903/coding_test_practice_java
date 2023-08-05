package class_solution._01_strings;

public class _04_reverse_word {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i++) {
            answer.append(s.charAt(i));
        }
        return answer.toString();
    }
}
