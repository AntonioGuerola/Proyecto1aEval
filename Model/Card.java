package Model;

import java.util.Objects;

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

    public Card generateCard() {
        Card cardGenerated = new Card();
        int valorDado = (int) Math.floor(Math.random() * 5 + 1);
        switch (valorDado) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                cardGenerated = Luigi();
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return cardGenerated;
    }

    private Card Luigi(){
        int contador
    }

}
