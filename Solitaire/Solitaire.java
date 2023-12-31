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

        // // CHUNK ONE: Testing shuffle
        // // System.out.println("hi world :3");
        // Deck deck = new Deck();
        // // System.out.println(deck.toString());
        // deck.shuffle();
        // System.out.println(deck.toString());

        // CHUNK TWO: testing removeCard
        // for (int i = 0; i < 52; i++) {
        //     if (i % 13 == 0) {
        //         System.out.print("\n");
        //     }
        //     System.out.print(deck.removeCard());
        //     System.out.print("\t");
        // }
        // System.out.println(deck.size());



        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck.toString());

        // we should automatically start the program with the piles being set up, the stock being full
        openPile1 = new ArrayBasedStack<Card>();
        openPile2 = new ArrayBasedStack<Card>();
        openPile3 = new ArrayBasedStack<Card>();
        openPile4 = new ArrayBasedStack<Card>();
        openPile5 = new ArrayBasedStack<Card>();
        openPile6 = new ArrayBasedStack<Card>();
        openPile7 = new ArrayBasedStack<Card>();

        closedPile2 = new ArrayBasedStack<Card>();
        closedPile3 = new ArrayBasedStack<Card>();
        closedPile4 = new ArrayBasedStack<Card>();
        closedPile5 = new ArrayBasedStack<Card>();
        closedPile6 = new ArrayBasedStack<Card>();
        closedPile7 = new ArrayBasedStack<Card>();

        stock = new ArrayBasedStack<Card>();
        waste = new ArrayBasedStack<Card>();

        hearts = new ArrayBasedStack<Card>();
        diamonds = new ArrayBasedStack<Card>();
        clubs = new ArrayBasedStack<Card>();
        spades = new ArrayBasedStack<Card>();

        openPile1.push(deck.removeCard());
        
        closedPile2.push(deck.removeCard());
        openPile2.push(deck.removeCard());

        closedPile3.push(deck.removeCard());
        closedPile3.push(deck.removeCard());
        openPile3.push(deck.removeCard());

        closedPile4.push(deck.removeCard());
        closedPile4.push(deck.removeCard());
        closedPile4.push(deck.removeCard());
        openPile4.push(deck.removeCard());

        closedPile5.push(deck.removeCard());
        closedPile5.push(deck.removeCard());
        closedPile5.push(deck.removeCard());
        closedPile5.push(deck.removeCard());
        openPile5.push(deck.removeCard());

        closedPile6.push(deck.removeCard());
        closedPile6.push(deck.removeCard());
        closedPile6.push(deck.removeCard());
        closedPile6.push(deck.removeCard());
        closedPile6.push(deck.removeCard());
        openPile6.push(deck.removeCard());

        closedPile7.push(deck.removeCard());
        closedPile7.push(deck.removeCard());
        closedPile7.push(deck.removeCard());
        closedPile7.push(deck.removeCard());
        closedPile7.push(deck.removeCard());
        closedPile7.push(deck.removeCard());
        openPile7.push(deck.removeCard());

        // System.out.println(deck.size());
        // System.out.println(deck.toString());

        // filling up the stock. The top of the stack is the END of the deck.
        while (!deck.isEmpty()) {
            stock.push(deck.removeCard());
        }
        
        /*  
            TODO: work on stock going to waste
            TODO: work on waste history (stacks and queues probably)
            TODO: work on piles going to foundation
            TODO: work on formatting the piles
        */





        // CHUNK THREE: testing stock to waste
        System.out.println("Stock:");
        ArrayBasedStack<Card> tempStock = new ArrayBasedStack<Card>();
        while (!stock.isEmpty()) {
            tempStock.push(stock.pop());
        }
        while (!tempStock.isEmpty()) {
            stock.push(tempStock.pop());
            System.out.print(stock.top() + "\t");
        }
        System.out.println();

        System.out.println("Waste:");
        ArrayBasedStack<Card> tempWaste = new ArrayBasedStack<Card>();
        while (!waste.isEmpty()) {
            tempWaste.push(waste.pop());
        }
        while (!tempWaste.isEmpty()) {
            waste.push(tempWaste.pop());
            System.out.print(waste.top() + "\t");
        }
        System.out.println("\n\n\n");



        moveStockToWaste();

        System.out.println("Stock:");
        tempStock = new ArrayBasedStack<Card>();
        while (!stock.isEmpty()) {
            tempStock.push(stock.pop());
        }
        while (!tempStock.isEmpty()) {
            stock.push(tempStock.pop());
            System.out.print(stock.top() + "\t");
        }
        System.out.println();

        System.out.println("Waste:");
        tempWaste = new ArrayBasedStack<Card>();
        while (!waste.isEmpty()) {
            tempWaste.push(waste.pop());
        }
        while (!tempWaste.isEmpty()) {
            waste.push(tempWaste.pop());
            System.out.print(waste.top() + "\t");
        }
        System.out.println("\n\n\n");




        moveStockToWaste();

        System.out.println("Stock:");
        tempStock = new ArrayBasedStack<Card>();
        while (!stock.isEmpty()) {
            tempStock.push(stock.pop());
        }
        while (!tempStock.isEmpty()) {
            stock.push(tempStock.pop());
            System.out.print(stock.top() + "\t");
        }
        System.out.println();

        System.out.println("Waste:");
        tempWaste = new ArrayBasedStack<Card>();
        while (!waste.isEmpty()) {
            tempWaste.push(waste.pop());
        }
        while (!tempWaste.isEmpty()) {
            waste.push(tempWaste.pop());
            System.out.print(waste.top() + "\t");
        }
        System.out.println("\n\n\n");



        moveStockToWaste();

        System.out.println("Stock:");
        tempStock = new ArrayBasedStack<Card>();
        while (!stock.isEmpty()) {
            tempStock.push(stock.pop());
        }
        while (!tempStock.isEmpty()) {
            stock.push(tempStock.pop());
            System.out.print(stock.top() + "\t");
        }
        System.out.println();

        System.out.println("Waste:");
        tempWaste = new ArrayBasedStack<Card>();
        while (!waste.isEmpty()) {
            tempWaste.push(waste.pop());
        }
        while (!tempWaste.isEmpty()) {
            waste.push(tempWaste.pop());
            System.out.print(waste.top() + "\t");
        }
        System.out.println("\n\n\n");




        moveWasteToStock();

        System.out.println("Stock:");
        tempStock = new ArrayBasedStack<Card>();
        while (!stock.isEmpty()) {
            tempStock.push(stock.pop());
        }
        while (!tempStock.isEmpty()) {
            stock.push(tempStock.pop());
            System.out.print(stock.top() + "\t");
        }
        System.out.println();

        System.out.println("Waste:");
        tempWaste = new ArrayBasedStack<Card>();
        while (!waste.isEmpty()) {
            tempWaste.push(waste.pop());
        }
        while (!tempWaste.isEmpty()) {
            waste.push(tempWaste.pop());
            System.out.print(waste.top() + "\t");
        }
        System.out.println("\n\n\n");

        

    }

    /** 
     * Stock is where you pull out new cards from. Stack data structure since you remove one card 
     * at a time, and you use a queue to reset it. The top of the stack is the END of the deck.
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

    private static ArrayBasedStack<Card> closedPile2;
    private static ArrayBasedStack<Card> closedPile3;
    private static ArrayBasedStack<Card> closedPile4;
    private static ArrayBasedStack<Card> closedPile5;
    private static ArrayBasedStack<Card> closedPile6;
    private static ArrayBasedStack<Card> closedPile7;


    // private void refillStack(ArrayBasedStack<Card> stack) {

    // }

    public static void moveStockToWaste() {
        if (!stock.isEmpty()) {
            waste.push(stock.pop());
        }
    }

    // NOTE: only use this whenever the stock is empty, this should never be an option for the player
    private static void moveWasteToStock() {
        while (!waste.isEmpty()) {
            stock.push(waste.pop());
        }
    }

    public static void moveWasteToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public static void moveWasteToFoundation(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public static void movePileToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {

    }

    public static void movePileToFoundation(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }

    public static void moveFoundationToPile(ArrayBasedStack<Card> a, ArrayBasedStack<Card> b) {
        
    }
}
