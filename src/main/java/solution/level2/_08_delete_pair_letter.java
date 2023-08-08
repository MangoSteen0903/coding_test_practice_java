package solution.level2;

public class _08_delete_pair_letter {
    //baabaa
    public int solution(String s) {
        int answer = -1;
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (stack.length() != 0 && stack.charAt(stack.length() - 1) == s.charAt(i)) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(s.charAt(i));
            }
        }
        return stack.length() == 0 ? 1 : 0;
    }
}
