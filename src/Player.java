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

    public void playRoulette(){
        int sp = Revolver.spinTheDrum(this);
        if(sp == Revolver.bullet){
            RouletteTable.death(this);
        }
    }

    public String toString(){
        return "Игрок " + this.name + " " + this.nickname;
    }
}
