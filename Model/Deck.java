package Model;

public class Deck {
    private Card[] deck;
    int contador = 0;

    public Deck(int tam) {
        this.deck = new Card[tam];
    }

    /* Generación de los palos de la baraja, en este caso serán de menor a mayor: nube, superMushroom, firePower, Luigi, Mario, Star */
    public boolean generateDeck(){
        boolean isGenerated = false;
        for (int i = 0; i < deck.length; i++){
            if(i < 4){
                deck[i] = nube();
            } else if(i < 9){
                deck[i] = mushroomPower();
            } else if(i < 14){
                deck[i] = firePower();
            } else if(i < 19){
                deck[i] = luigi();
            } else if(i < 24){
                deck[i] = mario();
            } else if(i < 29){
                deck[i] = star();
            }
                return isGenerated;
        }
    }

    private Card nube(){
        int valorNube = 1;
        return nube();
    }
    private Card mushroomPower(){
        int valorNube = 2;
        return mushroomPower();
    }
    private Card firePower(){
        int valorFirePower = 3;
        return firePower();
    }
    private Card luigi(){
        int valorLuigi = 4;
        return luigi();
    }
    private Card mario(){
        int valorMario = 5;
        return mario();
    }
    private Card star(){
        int valorStar = 6;
        return star();
    }


}
