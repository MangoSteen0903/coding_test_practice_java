package solution.level1;

public class _09_convert_string_int {
    public int solution(String s) {
        int typeOfNum = s.charAt(0) == '-' ? -1 : 1;
        int num = Character.getNumericValue(s.charAt(0)) == -1 ? Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
        return typeOfNum * num;
    }
}
