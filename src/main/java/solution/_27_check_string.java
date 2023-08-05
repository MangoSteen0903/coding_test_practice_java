package solution;

public class _27_check_string {
    public boolean solution(String s) {
        return (s.length() == 6 || s.length() == 4) && s.matches("[0-9]+");
    }
}
