package solution.level2;

import java.util.Arrays;

public class _03_closing_bracket {
    boolean solution(String s) {
        /*
        "()()"	true 1 -1 1 -1
        "(())()"	true 1 1 -1 -1 1 -1
        ")()("	false  -1 1 -1 -1
        "(()("	false  1 1 -1 1
        "(()))" false -1 -1 1 1 1
        "(((((()"
         */
        int stack = 0;
        boolean close = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                close = false;
                stack++;
            }
            if (s.charAt(i) == ')') {
                stack--;
                close = stack == 0;
            }
            if (stack < 0) return false;
        }
        return close;
    }
}
