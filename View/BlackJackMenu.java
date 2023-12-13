package View;

public class BlackJackMenu {
    public static int howManyPlayers(){
        System.out.println("1 jugador contra la IA");
        System.out.println("2 jugadores");
        System.out.println("3 jugadores");
        System.out.println("4 jugadores");
        return UI.readInt("¿Cuántos jugadores habrá?");
    }
}
