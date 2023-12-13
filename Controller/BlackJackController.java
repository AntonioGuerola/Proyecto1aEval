package Controller;

import Model.Card;
import Model.Deck;
import Model.Game;
import Model.Player;
import View.BlackJackMenu;
import View.MainMenu;
import View.UI;

import java.util.Objects;

public class BlackJackController {
    public static void blackJackController() {
        int players = 0;
        do {
            players = BlackJackMenu.howManyPlayers();
            Deck deck = new Deck();
            deck.makeFrenchDeck();
            Game game = new Game(deck, createPlayer(players));
            generatePlayersCards(game);
            numPlayers(players, game, deck);
            String result = game.Winner();
            BlackJackMenu.whosWinner(result);
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
            playersPlaying[0] = new Player(MainMenu.readPlayerName(), new Deck());
        } else {
            for (int i = 0; i < tamArray; i++) {
                playersPlaying[i] = new Player(MainMenu.readPlayerName(), new Deck());
            }
        }
        return playersPlaying;
    }

    public static void generatePlayersCards(Game game) {
        for (int i = 0; i < game.getPlayers().length; i++) {
            game.getPlayers()[i].fillCards();
        }
    }

    public static void numPlayers(int players, Game game, Deck deck) {
        if (players != 1) {
            playersPlaying(game);
        } else {
            onePlayerPlay(game.getPlayers()[0], deck, game);
            IA(game);
        }
    }

    public static void onePlayerPlay(Player playerPlaying, Deck gameDeck, Game game) {
        boolean toFinish = false;
        String playerAnswer = "";
        while (!toFinish) {
            System.out.println("Está jugando " + playerPlaying.getName());
            playerAnswer = UI.readString("Si quieres continuar pulsa Y y si te quieres plantar pulsa N");
            switch (playerAnswer) {
                case "Y":
                    Card randomCard = gameDeck.pickRandomCard();
                    playerPlaying.addCard(randomCard);
                    gameDeck.removeCardFromDeck(randomCard);
                    System.out.println(BlackJackMenu.printCard(randomCard.getValue(), randomCard.getSuit()) + "\n" + "Tienes: " + Game.calculatePoints(playerPlaying));
                    break;
                case "N":
                    toFinish = true;
                    break;
                default:
                    System.out.println("Te has equivocado");
            }
        }
    }

    public static void playersPlaying(Game game) {
        for (int i = 0; i < game.getPlayers().length; i++) {
            onePlayerPlay(game.getPlayers()[i], game.getDeck(), game);
        }
    }

    public static void IA(Game game) {
        int IApoints = 0;
        int playerPoints = Game.calculatePoints(game.getPlayers()[0]);
        if (playerPoints > 21) {
            playerPoints = 1;
        }
        while (playerPoints > IApoints) {
            Card randomCard = game.getDeck().pickRandomCard();
            game.getPlayers()[1].addCard(randomCard);
            game.getDeck().removeCardFromDeck(randomCard);
            IApoints = game.calculatePoints(game.getPlayers()[1]);
        }
        System.out.println("La IA tiene un total de " + IApoints + " puntos");
        UI.pressEnter();
    }
}
