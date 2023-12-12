package Model;

import java.util.Objects;

public class Player {
    private String name;
    private Desk playerDesk;

    public Player(){
        this.name = "Jugador";
    }

    public Player(String name, Desk playerDesk) {
        this.name = name;
        this.playerDesk = playerDesk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Desk getPlayerDesk() {
        return playerDesk;
    }

    public void setPlayerDesk(Desk playerDesk) {
        this.playerDesk = playerDesk;
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
                ", playerDesk=" + playerDesk +
                '}';
    }
}
