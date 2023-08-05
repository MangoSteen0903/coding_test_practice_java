package solution;

public class _26_scarce_price {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total_price = 0;
        for (int i = 1; i <= count; i++) {
            total_price += (long) i * price;
        }
        return total_price - money < 0 ? 0 : total_price - money;
    }
}
