package Model;

public class Deck {
    private Card[] deck;

    public Deck(int tam) {
        this.deck = new Card[tam];
    }

    public boolean generateDeck(){
        boolean isGenerated = false;
        for (int i = 0; i < deck.length; i++){

        }
        generateCard();
        return isGenerated;
    }


}
