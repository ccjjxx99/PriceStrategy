public class Svip implements NowPrice {
    @Override
    public double nowPrice(double originalPrice) {
        return originalPrice *0.8;
    }
}
