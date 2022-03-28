public class Player {
    private String name;
    private String nickname;
    static int i = 0;


    public Player(String playerName){
        try {

            String[] nameArr;
            nameArr = playerName.split(" ");

            this.name = nameArr[0];
            this.nickname = nameArr[1];
        }
        catch (ArrayIndexOutOfBoundsException e){

            nickname = "";
        }

    }

    public static void playRoulette(Player player){

        int sp = Revolver.spinTheDrum(player);
        boolean death = sp == Revolver.bullet;
        if(!death){
            try {
                i++;
                Roulette.roulette(i);
            }
            catch (IndexOutOfBoundsException ex){
                i = 0;
                Roulette.roulette(i);
            }

        }else {
            RouletteTable.death(player);

        }

    }

    public String toString(){
        return "Игрок " + this.name + " " + this.nickname;
    }
}
