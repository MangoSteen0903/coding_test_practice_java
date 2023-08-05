package class_solution._01_strings;

public class _09_extract_num {
    public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }
}
