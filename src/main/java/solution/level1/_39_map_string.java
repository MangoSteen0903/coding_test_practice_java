package solution.level1;

import java.util.HashMap;

public class _39_map_string {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, String> num_table = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();
        StringBuilder answerStr = new StringBuilder();
        String[] tempString = s.split("");
        num_table.put("zero", "0");
        num_table.put("one", "1");
        num_table.put("two", "2");
        num_table.put("three", "3");
        num_table.put("four", "4");
        num_table.put("five", "5");
        num_table.put("six", "6");
        num_table.put("seven", "7");
        num_table.put("eight", "8");
        num_table.put("nine", "9");

        for (String str : tempString) {
            if (!str.matches("[0-9]+")) {
                sb.append(str);
            } else {
                answerStr.append(str);
            }
            if (num_table.containsKey(sb.toString())) {
                String value_num = num_table.get(sb.toString());
                answerStr.append(value_num);
                sb = new StringBuilder();
            }
        }
        return Integer.parseInt(answerStr.toString());
    }
}
