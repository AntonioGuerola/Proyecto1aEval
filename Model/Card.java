package Model;

import java.util.Objects;

/* Constructor, get and set, toString y equals */
public class Card {
    private int value;
    private String suit;

    public Card() {
        this.value = 0;
        this.suit = "";
    }
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Suit: " + suit + " Value: " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(suit, card.suit);
    }

    public void imprimirCard(Card card){
        switch (suit){
            case "nube":
                //TODO= LOgica imprimir carta
                System.out.println("nube");
                break;
            case "mushroomPower":
                //TODO= LOgica imprimir carta
                System.out.println("mushroomPower");
                break;
            case "firePower":
                //TODO= LOgica imprimir carta
                System.out.println("firePower");
                break;
            case "luigi":
                //TODO= LOgica imprimir carta
                System.out.println("luigi");
                break;
            case "mario":
                //TODO= LOgica imprimir carta
                System.out.println("mario");
                break;
            case "star":
                //TODO= LOgica imprimir carta
                System.out.println("star");
                break;
        }
    }
}
