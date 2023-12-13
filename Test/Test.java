package Test;

import Controller.BlackJackController;
import Model.Card;
import Model.Deck;
import Model.Game;
import View.BlackJackMenu;

public class Test {
    public static void main(String[] args) {
        Deck Deck = new Deck();
        Deck.makeFrenchDeck();
        System.out.println(Deck);

        System.out.println(BlackJackMenu.printCard(9, "❤"));
    }
    
}
