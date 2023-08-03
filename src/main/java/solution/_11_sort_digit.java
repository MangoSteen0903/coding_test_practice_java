package solution;


import java.util.Arrays;
import java.util.Collections;

public class _11_sort_digit {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder letterList = new StringBuilder();
        for (String letter : list) letterList.append(letter);
        return Long.parseLong(letterList.reverse().toString());
    }
}
