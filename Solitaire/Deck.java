import java.util.Random;

/**
 * Ight steven this is a deck which you're gonna need in order to shuffle
 */
public class Deck {
    
    /** Creates a 4 Suit deck */
    private Card[][] deck;

    /** Constructor to create a 4 Suit array */
    public Deck() {
        deck = new Card[4][13];
        
        // deck[0] = new Suit("H");
        // deck[1] = new Suit("D");
        // deck[2] = new Suit("C");
        // deck[3] = new Suit("S");

        Suit hearts = new Suit("H");
        for (int i = 0; i < 13; i++) {
            deck[0][i] = hearts.getCard(i);
        }

        Suit diamonds = new Suit("D");
        for (int i = 0; i < 13; i++) {
            deck[1][i] = diamonds.getCard(i);
        }

        Suit clubs = new Suit("C");
        for (int i = 0; i < 13; i++) {
            deck[2][i] = clubs.getCard(i);
        }

        Suit spades = new Suit("S");
        for (int i = 0; i < 13; i++) {
            deck[3][i] = spades.getCard(i);
        }
    }

    /** Outputs the 4 Suit array as a String */
    public String toString() {
        String rtn = "";
        // for (int i = 0; i < 4; i++) {
        //     rtn = rtn + deck[i].toString() + "\n";
        // }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                rtn = rtn + deck[i][j].toString() + "\t";
            }
            rtn = rtn + "\n";
        }
        return rtn;
    }

    public void shuffle() {
        Random random = new Random();
        Card[][] tempDeck = new Card[4][13];

        // turns the deck into an ArrayBasedList
        ArrayBasedList<Card> cardDeck = new ArrayBasedList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardDeck.add(deck[i][j]);
            }
        }
        
        // 
        for (int i = 0; i < 52; i++) {
            int randomInt = random.nextInt(52);
            // System.out.println(randomInt);
            int row = randomInt / 13;
            int column = randomInt % 13;

            if (tempDeck[row][column] != null) {
                // tempDeck[row][column] = ;
            }


        }

        // use this if you wanna do it using Collections
        // ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
        // for (int i = 0; i < 52; i++) {
        //     list.add(i);
        //     // System.out.println(list.get(i));
        // }

        



    }

    
}
