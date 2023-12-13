package Model;

import java.util.Arrays;
import java.util.Objects;

public class Player {
    private String name;
    private Card[] cards;
    private Deck deck;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Player(String name, Deck deck) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    public void fillCards() {
        this.cards = new Card[52];
        for (int i = 0; i < this.cards.length; i++) {
            this.cards[i] = new Card(0, "");
        }
    }
    public void addCard(Card addedCard) {
        boolean comprobate = false;
        for (int i = 0; i < cards.length && !comprobate; i++) {
            if (cards[i].getValue() == 0) {
                cards[i] = new Card();
                this.cards[i] = addedCard;
                comprobate = true;
            }
        }
    }
}
