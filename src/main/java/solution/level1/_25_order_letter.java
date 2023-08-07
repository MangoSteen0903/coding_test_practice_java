package solution.level1;

import java.util.stream.Collectors;

public class _25_order_letter {
    public String solution(String s) {
        return s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).reverse().toString();
    }
}
