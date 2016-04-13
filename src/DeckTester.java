import java.util.ArrayList;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"hearts", "spades"};
		int[] pointValues1 = {11, 12, 13};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		
		String[] ranks2 = {"ace, two, six"};
		String[] suits2 = {"clubs", "diamonds", "spades"};
		int[] pointValues2 = {1, 2, 6};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		
		String[] ranks3 = {"queen", "seven", "eight"};
		String[] suits3 = {"hearts"};
		int[] pointValues3 = {12, 7, 8};
		Deck deck3 = new Deck(ranks3, suits3, pointValues3);
		
		System.out.println(deck3);
		
		
		
	}
}
