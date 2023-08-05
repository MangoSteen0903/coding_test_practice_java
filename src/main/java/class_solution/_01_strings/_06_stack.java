package class_solution._01_strings;

import java.util.ArrayList;

public class _06_stack {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (answer.indexOf(str.substring(i, i + 1)) == -1) {
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }
}
