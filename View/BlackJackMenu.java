package View;

public class BlackJackMenu {
    public static int howManyPlayers(){
        System.out.println("1 jugador contra la IA");
        System.out.println("2 jugadores");
        System.out.println("3 jugadores");
        System.out.println("4 jugadores");
        return UI.readInt("¿Cuántos jugadores habrá?");
    }
    public static String printCard(int value, String suit){
        String card = "************\n" +
                "*          *\n" +
                "*          *\n" +
                "*          *\n" +
                "* " + suit + "     " + value + " *\n" +
                "*          *\n" +
                "*          *\n" +
                "*          *\n" +
                "*          *\n" +
                "************\n";
    return card;
    }
    public static void whosWinner(String winner){
        if (winner.equals("empate")) {
            System.out.println("Habéis empatado");
        } else {
            System.out.println("Ha ganado el jugador " + winner);
        }
        UI.pressEnter();
    }
}
