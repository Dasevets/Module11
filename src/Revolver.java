public class Revolver {

    static int bullet;
    public static void loadRevolver(){

        bullet = (int) ((Math.random() * 5) + 1);
        System.out.print("Патрон заряжен ");
        System.out.println(bullet + " слот\n");
    }


    public static int spinTheDrum(Player pl){
        int spin = (int)((Math.random() * 5) + 1);
        System.out.print(pl.toString() + " крутит барабан ");
        System.out.println(spin + " слот");
        return spin;
    }
}
