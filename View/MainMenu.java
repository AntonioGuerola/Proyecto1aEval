package View;

public class MainMenu {
    public static int mainMenu() {
        System.out.println("Bienvenido al CASINO DE ORO");
        System.out.println("En este casino tenemos dos juegos a elegir entre BlackJack (con la baraja francesa) y Póker (temático de Mario Bros.)");
        System.out.println("1. Jugar al BlackJack");
        System.out.println("2. Jugar al Póker");
        System.out.println("3. Salir");
        return UI.readInt("¿Qué desea hacer?");
    }

}
