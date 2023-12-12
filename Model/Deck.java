package Model;

import java.util.Arrays;

public class Deck{
    private Card[] cards;
    private String type;

    public Deck() {
        this.type = "";
        this.cards = new Card[52];
    }
    public Deck(String type) {
        this.type = type;
    }

    public Card[] getCards() {
        return cards;
    }

    private void makeSpanishDesk(){
        for (int i = 0; i < this.cards.length; i++) {
            if (i < 12) {
                cards[i] = gold();
            } else if (i < 25) {
                cards[i] = cups();
            } else if (i < 38) {
                cards[i] = swords();
            } else if (i < 51) {
                cards[i] = clubs();
            }
        }
    }

    public void shuffleDesk(){

    }

    public Card[] pickRandomCard(){
        return null;
    }

    public void printDesk(){

    }

    public void printCard(Card card){

    }

    public void printCards(Card[] cards){

    }

    //Esto de a continuación sería para el minijuego de póker de Mario Bros
/* public class Deck {
    private Card[] deck;

    public Deck(Card[] deck) {
        this.deck = deck;
    }

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck1 = (Deck) o;
        return Arrays.equals(deck, deck1.deck);
    }
*/
    /* Generación de los palos de la baraja, en este caso serán de menor a mayor: nube, superMushroom, firePower, Luigi, Mario, Star */
  /*  public void generateDeck() {
        this.deck = new Card[30];
        for (int i = 0; i < this.deck.length; i++) {
            if (i < 4) {
                deck[i] = nube();
            } else if (i < 9) {
                deck[i] = mushroomPower();
            } else if (i < 14) {
                deck[i] = firePower();
            } else if (i < 19) {
                deck[i] = luigi();
            } else if (i < 24) {
                deck[i] = mario();
            } else if (i < 29) {
                deck[i] = star();
            }
        }
    }

    private Card nube() {
        int valorNube = 1;
        return nube();
    }

    private Card mushroomPower() {
        int valorNube = 2;
        return mushroomPower();
    }

    private Card firePower() {
        int valorFirePower = 3;
        return firePower();
    }

    private Card luigi() {
        int valorLuigi = 4;
        return luigi();
    }

    private Card mario() {
        int valorMario = 5;
        return mario();
    }

    private Card star() {
        int valorStar = 6;
        return star();
    }


*/
}