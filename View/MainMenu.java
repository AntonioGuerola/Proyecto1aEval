package View;

import Model.Player;

import java.util.Objects;

public class MainMenu {
    public static int mainMenu() {
        System.out.println("Bienvenido al CASINO DE ORO");
        System.out.println("En este casino tenemos dos juegos a elegir entre BlackJack (con la baraja francesa) y Póker (temático de Mario Bros.)");
        System.out.println("1. Jugar al BlackJack");
        System.out.println("2. Jugar al Póker");
        System.out.println("3. Salir");
        return UI.readInt("¿Qué desea hacer?");
    }
    public static String readPlayerName() {
        return UI.readString("Introduce el nombre del jugador");
    }
    public static Object nameCheck(Player[] playersPlaying) {
        String name = "";
        boolean comp = true;
        do {
            name = MainMenu.readPlayerName();
            for (int i = 0; i < playersPlaying.length && comp; i++) {
                if (playersPlaying[i] != null) {
                    if (Objects.equals(name, playersPlaying[i].getName().toLowerCase().replaceAll(" ", ""))) {
                        comp = false;
                    }
                }
            }
        } while (!comp);
        return name;
    }
}
