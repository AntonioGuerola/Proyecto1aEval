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

    public static int calculatePoints(Player player) {
        int playerPoints = 0;
        for (int i = 0; i < player.getCards().length; i++) {
            if (player.getCards()[i].getValue() >= 10) {
                playerPoints += 10;
            } else if (player.getCards()[i].getValue() == 1 && playerPoints < 11) {
                playerPoints += 11;
            } else {
                playerPoints += player.getCards()[i].getValue();
            }
        }
        return playerPoints;
    }

    public String Winner() {
        int points = 0;
        int winnerPoints = 0;
        String winner = "";
        for (int i = 0; i < this.players.length; i++) {
            points = calculatePoints(this.players[i]);
            if (winnerPoints == points) {
                winner = "empate";
            }
            if (winnerPoints < points && points <= 21) {
                winnerPoints = points;
                winner = this.players[i].getName();
            }
            if (Objects.equals(winner, "")) {
                winner = "ninguno";
            }
        }
        return winner;
    }
}
