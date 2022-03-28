public class Roulette {
    public static void roulette(){
        RouletteTable.rouletteTable();
        Revolver revolver = new Revolver();
        revolver.loadRevolver();

        for (int i = 0; i < RouletteTable.players.length; i++) {
            if(RouletteTable.players[i] == null){
                continue;
            }
            RouletteTable.players[i].playRoulette();

        }
    }
}
