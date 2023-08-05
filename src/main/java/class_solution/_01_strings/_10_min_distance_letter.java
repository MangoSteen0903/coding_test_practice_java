package class_solution._01_strings;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_min_distance_letter {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) index.add(i);
        }
        for (int j = 0; j < s.length(); j++) {
            int[] min_length = new int[index.toArray().length];
            for (int k = 0; k < index.toArray().length; k++) {
                min_length[k] = Math.abs(index.get(k) - j);
            }
            answer[j] = Arrays.stream(min_length).min().getAsInt();
        }
        return answer;
    }
}
