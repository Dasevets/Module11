import java.util.Arrays;

public class Player {
    private String name;
    private String nickname;


    public Player(String playerName){
        try {

            String[] nameArr;
            nameArr = playerName.split(" ");

            this.name = nameArr[0];
            this.nickname = nameArr[1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
            nickname = "";
        }
    }

    public void playRoulette(Player player){
        int sp = Revolver.spinTheDrum(player);
        if(sp == Revolver.bullet){
            RouletteTable.death(player);
        }
    }

    public String toString(){
        return "Игрок " + this.name + " " + this.nickname;
    }
}
