package solution.level1;

import java.util.Arrays;

public class _40_secret_map {
    //n	5
    //arr1	[9, 20, 28, 18, 11]
    //arr2	[30, 1, 21, 17, 28]
    //출력	["#####","# # #", "### #", "# ##", "#####"]
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            int temp1 = arr1[i];
            int[] binary1 = new int[n];
            int binary1_index = binary1.length - 1;
            int temp2 = arr2[i];
            int[] binary2 = new int[n];
            int binary2_index = binary2.length - 1;
            while (temp1 > 0) {
                binary1[binary1_index] = temp1 % 2;
                temp1 = temp1 / 2;
                binary1_index--;
            }
            while (temp2 > 0) {
                binary2[binary2_index] = temp2 % 2;
                temp2 = temp2 / 2;
                binary2_index--;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (binary1[j] == 1 || binary2[j] == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
