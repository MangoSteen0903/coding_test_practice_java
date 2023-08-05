package class_solution._01_strings;

public class _12_cipher {
    public String solution(int n, String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            String letter_cipher = s.substring(index, index + 7);
            letter_cipher = letter_cipher.replace('#', '1').replace('*', '0');
            char[] cipher_arr = letter_cipher.toCharArray();
            int result = 0;
            for (int i = 0; i < cipher_arr.length; i++) {
                if (cipher_arr[i] == '1') result += (int) Math.pow(2, cipher_arr.length - i - 1);
            }
            answer.append((char) result);
            index += 7;
        }
        return answer.toString();
    }
}
