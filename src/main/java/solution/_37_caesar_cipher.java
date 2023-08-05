package solution;

import java.nio.charset.StandardCharsets;

public class _37_caesar_cipher {
    public String solution(String s, int n) {
        String answer = "";
        String[] letters = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String str : letters) {
            if (!str.equals(" ")) {
                int ascii = str.getBytes(StandardCharsets.US_ASCII)[0];
                if (ascii > 'Z' && ascii + n > 'z') {
                    ascii = ascii + n - 26;
                } else if (ascii <= 'Z' && ascii + n > 'Z') {
                    ascii = ascii + n - 26;
                } else {
                    ascii += n;
                }
                sb.append((char) ascii);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
