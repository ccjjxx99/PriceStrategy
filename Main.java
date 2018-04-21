public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(500D);
        System.out.println("玩家需要付钱：" + player.getFinalCost());
        player.buy(1000D);
        System.out.println("玩家需要付钱：" + player.getFinalCost());
        player.buy(2000D);
        System.out.println("玩家需要付钱：" + player.getFinalCost());
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.getFinalCost());
    }
}
