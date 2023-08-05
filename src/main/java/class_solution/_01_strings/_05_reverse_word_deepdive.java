package class_solution._01_strings;

public class _05_reverse_word_deepdive {
    public String solution(String str) {
        String answer = "";
        String[] letters = str.split("");
        int index = letters.length - 1;
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i].matches("[A-Za-z]+")) {
                String temp = letters[index];
                letters[index] = letters[i];
                letters[i] = temp;
            }
            index--;
        }
        return String.join("", letters);
    }
}
