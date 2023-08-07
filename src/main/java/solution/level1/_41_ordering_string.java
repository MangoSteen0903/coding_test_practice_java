package solution.level1;

import java.util.Arrays;

//["sun", "bed", "car"]	1	["car", "bed", "sun"]
public class _41_ordering_string {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 1; i < strings.length; i++) {
            String key = strings[i];
            int j = i - 1;
            while (j >= 0 && key.charAt(n) <= strings[j].charAt(n)) {
                strings[j + 1] = strings[j];
                if (key.charAt(n) == strings[j].charAt(n)) {
                    strings[j] = key;
                }
                j--;
            }
            strings[j + 1] = key;
        }
        return strings;
    }
}
