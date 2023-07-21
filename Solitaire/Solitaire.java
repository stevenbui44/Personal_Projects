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

        System.out.println("hi world :3");
        // System.out.println("\u001B[31mThis text will be in red color\u001B[0m");

        // Suit suit = new Suit("D");
        // System.out.println(suit.toString());

        Deck deck = new Deck();
        System.out.println(deck.toString());

        deck.shuffle();

        System.out.println(deck.toString());
        // ArrayList<Integer> list = new ArrayList<Integer>();

    }
}
