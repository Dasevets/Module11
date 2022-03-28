
import java.util.Arrays;
import java.util.Scanner;

public class RouletteTable {
    static Scanner sc = new Scanner(System.in);

    static Player[] players = new Player[6];

    public static void rouletteTable() {
        System.out.println("Добро пожаловать в русскую рулетку, играет не больше 6 игроков.");
        System.out.println("Введите имена игроков: ");

        for (int i = 0; i < players.length; i++) {

            String s = sc.next();

            if (s.equals("play")) {
                break;
            }

            String s1 = " " + sc.next();



            players[i] = new Player(s + s1);

        }
        System.out.println(Arrays.toString(players));
        System.out.println("Игроки идут за стол");
        for (Player pl : players) {

            try {
                System.out.println(pl.toString() + " сел за стол");
            } catch (NullPointerException e) {
                e.getMessage();
            }
        }
    }


    public static void death(Player player) {
        System.out.println("BOOM!");
        System.out.println(player.toString() + " умер");

    }
}
