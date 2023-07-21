/**
 * Okay steven so this is the main file where you run the whole thing
 * 
 * Compile:     javac Solitaire.java
 * Run:         java Solitaire
 * 
 * Compile:     javac *.java
 * 
 */

public class Solitaire {
    public static void main(String[] args) {

        // CHUNK ONE: Testing shuffle
        // System.out.println("hi world :3");
        Deck deck = new Deck();
        // System.out.println(deck.toString());
        deck.shuffle();
        System.out.println(deck.toString());

        // CHUNK TWO: testing removeCard
        // for (int i = 0; i < 52; i++) {
        //     if (i % 13 == 0) {
        //         System.out.print("\n");
        //     }
        //     System.out.print(deck.removeCard());
        //     System.out.print("\t");
        // }
        // System.out.println(deck.size());



        // Deck deck = new Deck();
        // deck.shuffle();

        // // we should automatically start the program with the piles being set up, the stock being full
        // openPile1 = new ArrayBasedStack<Card>();
        // openPile2 = new ArrayBasedStack<Card>();
        // openPile3 = new ArrayBasedStack<Card>();
        // openPile4 = new ArrayBasedStack<Card>();
        // openPile5 = new ArrayBasedStack<Card>();
        // openPile6 = new ArrayBasedStack<Card>();
        // openPile7 = new ArrayBasedStack<Card>();

        // closedPile1 = new ArrayBasedStack<Card>();
        // closedPile2 = new ArrayBasedStack<Card>();
        // closedPile3 = new ArrayBasedStack<Card>();
        // closedPile4 = new ArrayBasedStack<Card>();
        // closedPile5 = new ArrayBasedStack<Card>();
        // closedPile6 = new ArrayBasedStack<Card>();
        // closedPile7 = new ArrayBasedStack<Card>();

        // stock = new ArrayBasedStack<Card>();
        // waste = new ArrayBasedStack<Card>();

        // hearts = new ArrayBasedStack<Card>();
        // diamonds = new ArrayBasedStack<Card>();
        // clubs = new ArrayBasedStack<Card>();
        // spades = new ArrayBasedStack<Card>();

        

    }

    /** 
     * Stock is where you pull out new cards from. Stack data structure since you remove one card 
     * at a time, and you use a queue to reset it.
     */
    private static ArrayBasedStack<Card> stock;

    /** 
     * Waste is where you put new cards from the stock. Stack data structure since the most recent
     * card you add onto the waste is the one you can remove.
     */
    private static ArrayBasedStack<Card> waste;

    /**
     * Hearts is part of the foundation, where hearts cards go. Stack data structure since first in 
     * first out.
     */
    private static ArrayBasedStack<Card> hearts;
    private static ArrayBasedStack<Card> diamonds;
    private static ArrayBasedStack<Card> clubs;
    private static ArrayBasedStack<Card> spades;

    private static ArrayBasedStack<Card> openPile1;
    private static ArrayBasedStack<Card> openPile2;
    private static ArrayBasedStack<Card> openPile3;
    private static ArrayBasedStack<Card> openPile4;
    private static ArrayBasedStack<Card> openPile5;
    private static ArrayBasedStack<Card> openPile6;
    private static ArrayBasedStack<Card> openPile7;

    private static ArrayBasedStack<Card> closedPile1;
    private static ArrayBasedStack<Card> closedPile2;
    private static ArrayBasedStack<Card> closedPile3;
    private static ArrayBasedStack<Card> closedPile4;
    private static ArrayBasedStack<Card> closedPile5;
    private static ArrayBasedStack<Card> closedPile6;
    private static ArrayBasedStack<Card> closedPile7;


    public void moveStockToWaste(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {

    }

    public void moveWasteToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public void moveWasteToFoundation(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public void movePileToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {

    }

    public void movePileToFoundation(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public void moveFoundationToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }
}
