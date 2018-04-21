public class Player {
    private double sumCost = 0D;
    private double cost = 0D;
    private NowPrice nowPrice = new Common();

    public void buy(double cost){
        this.cost = cost;
        sumCost += cost;
        if (sumCost >= 5000){
            nowPrice = new Ssvip();
        }
        else if (sumCost >= 2000){
            nowPrice = new Svip();
        }
        else if (sumCost >= 1000){
            nowPrice = new Vip();
        }
    }

    public double getFinalCost() {
        return nowPrice.nowPrice(cost);
    }
}
