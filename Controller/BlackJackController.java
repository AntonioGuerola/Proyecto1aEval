package Controller;

import Model.Card;
import Model.Deck;
import Model.Game;
import Model.Player;
import View.BlackJackMenu;
import View.MainMenu;

public class BlackJackController {
    public static void blackJackController() {
        int players = 0;
        do {
            players = BlackJackMenu.howManyPlayers();
            Deck Deck = new Deck();
            Deck.makeFrenchDeck();
            Game game = new Game(Deck, createPlayer(players));
            numPlayers(players);
        } while (players != 4);
    }
    public static Player[] createPlayer(int players) {
        int tamArray = players;
        if (players == 1) {
            tamArray += 1;
        }
        Player[] playersPlaying = new Player[tamArray];
        if (players == 1) {
            playersPlaying[1] = new Player("IA", new Deck());
            playersPlaying[0] = new Player((String) MainMenu.nameCheck(playersPlaying),new Deck());
        } else {
            for (int i = 0; i < tamArray; i++) {
                playersPlaying[i] = new Player((String) MainMenu.nameCheck(playersPlaying),new Deck());
            }
        }
        return playersPlaying;
    }

    public static void numPlayers(int players) {
        switch (players) {
            case 1:

                break;
        }
    }
}
