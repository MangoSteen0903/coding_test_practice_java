package class_solution._01_strings;

public class _03_find_long_word {
    public String solution(String str) {

        String[] words = str.split(" ");
        String answer = words[0];
        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > answer.length()) answer = words[i];
        }
        return answer;
    }
}
