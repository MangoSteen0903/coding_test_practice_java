package class_solution._01_strings;

import java.util.Arrays;

public class _02_convert_letters {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (String s : str.split("")) {
            if (s.matches("[A-Z]+")) answer.append(s.toLowerCase());
            if (s.matches("[a-z]+")) answer.append(s.toUpperCase());
        }
        return answer.toString();
    }
}
