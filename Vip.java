public class Vip implements NowPrice {
    @Override
    public double nowPrice(double originalPrice) {
        return originalPrice * 0.9;
    }
}
