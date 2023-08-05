package class_solution._01_strings;

public class _07_palindrome_string {
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        boolean is_palindrome = true;
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                is_palindrome = false;
                break;
            }
            j--;
        }
        return is_palindrome ? "YES" : "NO";
    }
}
