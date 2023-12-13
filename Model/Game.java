package Model;

import java.util.Arrays;
import java.util.Objects;

public class Game {
    private Deck deck;
    private Player[] players;

    public Game(Deck deck, Player[] players) {
        this.deck = deck;
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(deck, game.deck) && Arrays.equals(players, game.players);
    }

    @Override
    public String toString() {
        return "Game{" +
                "deck=" + deck +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
