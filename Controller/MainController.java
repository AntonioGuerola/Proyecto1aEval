package Controller;

import View.MainMenu;
import View.UI;

import java.awt.*;

public class MainController {
    public static void starApp(){
        int option = -1;
        do {
            option = MainMenu.mainMenu();
            mainController(option);
        }while(option != 3);
    }

    public static void mainController(int option){
        switch (option) {
            case 1:
                int players = 0;
                do {
                    players = howManyPlayers();
                    blackJack(players);
                } while (players != 4);
                break;
            case 2:
                System.out.println("Próximamente");
                break;
            case 3:
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    public static int howManyPlayers(){
        System.out.println("1 jugador contra la IA");
        System.out.println("2 jugadores");
        System.out.println("3 jugadores");
        System.out.println("4 jugadores");
        return UI.readInt("¿Cuántos jugadores habrá?");
    }
    public static void blackJack(int players){

    }
}
