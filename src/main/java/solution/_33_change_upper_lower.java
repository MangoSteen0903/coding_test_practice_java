package solution;

import java.util.Arrays;

public class _33_change_upper_lower {
    public String solution(String s) {

        String[] words = s.split(" ", -1);
        System.out.println(Arrays.toString(words));
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = convert_word(words[i]);
        }
        System.out.println();
        return String.join(" ", result);
    }

    private String convert_word(String word) {
        StringBuilder sb = new StringBuilder();
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            sb.append(i % 2 == 0 ? letters[i].toUpperCase() : letters[i].toLowerCase());
        }
        return sb.toString();
    }
}
