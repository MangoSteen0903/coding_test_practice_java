package solution.level2;

import java.util.Arrays;

public class _01_jaden_case {

    public String solution(String s) {
        String[] words = s.split("");
        String result = "";
        boolean flag = true;
        for (String str : words) {
            result += flag ? str.toUpperCase() : str.toLowerCase();
            flag = str.equals(" ");
        }
        return result;
    }

}
