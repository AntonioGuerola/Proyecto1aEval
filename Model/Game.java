package Model;

import java.util.Arrays;
import java.util.Objects;

public class Game {
    private Desk desk;
    private Player[] players;

    public Game(Desk desk, Player[] players) {
        this.desk = desk;
        this.players = players;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
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
        return Objects.equals(desk, game.desk) && Arrays.equals(players, game.players);
    }

    @Override
    public String toString() {
        return "Game{" +
                "desk=" + desk +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
