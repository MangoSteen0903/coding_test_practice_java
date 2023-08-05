package class_solution._01_strings;

import java.util.Arrays;

public class _08_palindrome_string_deep {
    public String solution(String str) {
        String answer = "";
        String[] letters = (String[]) Arrays.stream(str.split("")).filter(i -> i.matches("^[a-zA-Z]*$")).toArray();
        System.out.println(Arrays.toString(letters));
        return answer;
    }
}
