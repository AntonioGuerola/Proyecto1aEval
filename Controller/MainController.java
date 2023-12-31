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
                BlackJackController.blackJackController();
                break;
            case 2:
                System.out.println("Próximamente");
                UI.pressEnter();
                break;
            case 3:
                break;
            default:
                System.out.println("Opción incorrecta");
                UI.pressEnter();
        }
    }
}
