import java.util.Collections;
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
        // Card[][] tempDeck = new Card[4][13];

        // // CHUNK ONE: creating clusters = bad
        // Random random = new Random();
        // // turns the deck into an ArrayBasedQueue
        // ArrayBasedQueue<Card> cardDeck = new ArrayBasedQueue<Card>();
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 13; j++) {
        //         cardDeck.enqueue(deck[i][j]);
        //     }
        // }
        // // places each card in the Queue in a random position in a new Deck
        // for (int i = 0; i < 52; i++) {
        //     int randomInt = random.nextInt(52);
        //     int row = randomInt / 13;
        //     int column = randomInt % 13;

        //     // if there is no card there yet, add it
        //     if (tempDeck[row][column] == null) {
        //         tempDeck[row][column] = cardDeck.dequeue();
        //     }
        //     // if there is a card there already, place it in the next spot
        //     else {
        //         // Find the next available spot to place the card
        //         boolean placed = false;
        //         for (int r = 0; r < 4 && !placed; r++) {
        //             for (int c = 0; c < 13 && !placed; c++) {
        //                 if (tempDeck[r][c] == null) {
        //                     tempDeck[r][c] = cardDeck.dequeue();
        //                     placed = true;
        //                 }
        //             }
        //         }
        //         // If all positions are occupied, it means the deck is full.
        //         // Handle the situation accordingly, e.g., throw an exception or break the loop.
        //         if (!placed) {
        //             break;
        //         }
        //     }
        // }
        // deck = tempDeck;



        // CHUNK TWO: Collections won't work
        // // use this if you wanna do it using Collections
        // ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
        // for (int i = 0; i < 52; i++) {
        //     list.add(i);
        // }

        Card[][] tempDeck = new Card[4][13];

        Random random = new Random();

        // puts all of the cards in the deck into one long queue
        ArrayBasedQueue<Card> cardDeck = new ArrayBasedQueue<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardDeck.enqueue(deck[i][j]);
            }
        }

        int randomInt = random.nextInt(52);
        int row = randomInt / 13;
        int column = randomInt % 13;

        // do this until the temporary deck is empty
        while (!cardDeck.isEmpty()) {
            if (tempDeck[row][column] == null) {
                tempDeck[row][column] = cardDeck.dequeue();
            }
            else {
                randomInt = random.nextInt(52);
                row = randomInt / 13;
                column = randomInt % 13;
            }
        }
        deck = tempDeck;
    }

    
}
