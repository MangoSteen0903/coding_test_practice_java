package class_solution._01_strings;

public class _01_find_letters {
    public int solution(String s, String letter) {
        int answer = 0;
        s = s.toLowerCase();
        String[] letters = s.split("");
        for (String str : letters) {
            answer += str.equals(letter) ? 1 : 0;
        }
        return answer;
    }
}
