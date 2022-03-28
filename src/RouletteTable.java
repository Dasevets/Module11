
import java.util.*;

public class RouletteTable {
    static Scanner sc = new Scanner(System.in);

    static List<Player> players = new ArrayList<>();
    static int round = 1;

    public static void rouletteTable() {
        System.out.println("Добро пожаловать в русскую рулетку, играет не больше 6 игроков.");
        System.out.println("Введите имена игроков: ");

        for (int i = 0; i < 6; i++) {

            String s = sc.nextLine();

            if (s.equals("play")) {
                break;
            }

            players.add(new Player(s ));

        }
        System.out.println(players.toString());
        System.out.println("Игроки идут за стол");
        for (Player pl : players) {

            try {
                System.out.println(pl.toString() + " сел за стол");
            } catch (NullPointerException e) {
                e.getMessage();
            }
        }
        System.out.println(" ");
        Revolver.loadRevolver();
        Roulette.roulette(0);
    }


    public static void death(Player player) {
        System.out.println("\nBOOM!");
        System.out.println(player.toString() + " умер");

        System.out.println("Раунд " + round + " закончен\n");
        round++;

        players.remove(player);
        System.out.println("\nВ игре участвуют: " + players.toString() + "\n");
        Revolver.loadRevolver();
        Roulette.roulette(0);
    }
}
