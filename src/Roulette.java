public class Roulette {
    //static Revolver revolver = new Revolver();

    public static void start(){
        RouletteTable.rouletteTable();
    }
    public static void roulette(int i){



            if(RouletteTable.players.size() == 1){
                System.out.println("Игра закончена!");
                System.out.println(RouletteTable.players.get(0).toString() + " победитель!");
                System.exit(0);
            }

            Player.playRoulette(RouletteTable.players.get(i));


    }
}
