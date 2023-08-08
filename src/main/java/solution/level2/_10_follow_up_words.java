package solution.level2;

import java.util.Arrays;
import java.util.Optional;

public class _10_follow_up_words {
    /*
    3 ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]	[3,3]
     */
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        StringBuilder already_use = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (already_use.indexOf(" " + words[i] + " ") != -1) {
                answer = new int[]{(i % n) + 1, (i / n) + 1};
                break;
            } else if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer = new int[]{(i % n) + 1, (i / n) + 1};
                break;
            } else {
                already_use.append(" " + words[i] + " ");
            }
        }

        return answer;
    }
}
