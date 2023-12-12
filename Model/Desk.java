package Model;

import java.util.Arrays;

public class Desk{
    private Card[] cards;

    public Desk() {
        this.cards = new Card[52];
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk = (Desk) o;
        return Arrays.equals(cards, desk.cards);
    }

    private void makeFrenchDesk(){
        int value = 1;
        for (int i = 0; i < this.cards.length; i++) {
            cards[i] = new Card();
            if (i < 13) {
                cards[i].setSuit("♥");
                cards[i].setValue(value);
            } else if (i < 26) {
                cards[i].setSuit("♣");
                cards[i].setValue(value);
            } else if (i < 39) {
                cards[i].setSuit("♠");
                cards[i].setValue(value);
            } else if (i < 52) {
                cards[i].setSuit("♦");
                cards[i].setValue(value);
            }
            value++;
            if (value == 14){
                value = 1;
            }
        }
    }

    public Card pickRandomCard(){
        Card randomCard = cards[(int) (Math.random() * (52-1))];
        return randomCard;
    }

    //Esto de a continuación sería para el minijuego de póker de Mario Bros
/* public class Desk {
    private Card[] desk;

    public Desk(Card[] desk) {
        this.desk = desk;
    }

    public Card[] getDesk() {
        return desk;
    }

    public void setDesk(Card[] desk) {
        this.desk = desk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk1 = (Desk) o;
        return Arrays.equals(desk, desk1.desk);
    }
*/
    /* Generación de los palos de la baraja, en este caso serán de menor a mayor: nube, superMushroom, firePower, Luigi, Mario, Star */
  /*  public void generateDesk() {
        this.desk = new Card[30];
        for (int i = 0; i < this.desk.length; i++) {
            if (i < 4) {
                desk[i] = nube();
            } else if (i < 9) {
                desk[i] = mushroomPower();
            } else if (i < 14) {
                desk[i] = firePower();
            } else if (i < 19) {
                desk[i] = luigi();
            } else if (i < 24) {
                desk[i] = mario();
            } else if (i < 29) {
                desk[i] = star();
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