public class Ssvip implements NowPrice {
    @Override
    public double nowPrice(double originalPrice) {
        return originalPrice * 0.7;
    }
}
