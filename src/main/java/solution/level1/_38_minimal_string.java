package solution.level1;

public class _38_minimal_string {
    //"3141592"	"271"	2
    public int solution(String t, String p) {
        int answer = 0;
        long pivot_num = Long.parseLong(p);
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            long slice_num = Long.parseLong(t.substring(i, i + p.length()));
            System.out.println(slice_num);
            answer += slice_num <= pivot_num ? 1 : 0;
        }
        return answer;
    }
}
