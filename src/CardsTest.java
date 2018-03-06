import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class CardsTest {
	public static Scanner in = new Scanner(System.in);
	Card cards[] = {new Card("Ace","Hearts"),
			new Card("Deuce","Hearts"),
			new Card("Three","Hearts"),
			new Card("Four","Hearts"),
			new Card("Five","Hearts"),
			new Card("Six","Hearts"),
			new Card("Seven","Hearts"),
			new Card("Eight","Hearts"),
			new Card("Nine","Hearts"),
			new Card("Ten","Hearts"),
			new Card("Jack","Hearts"),
			new Card("Queen","Hearts"),
			new Card("King","Hearts"),
			new Card("Ace","Diamonds"),
			new Card("Deuce","Diamonds"),
			new Card("Three","Diamonds"),
			new Card("Four","Diamonds"),
			new Card("Five","Diamonds"),
			new Card("Six","Diamonds"),
			new Card("Seven","Diamonds"),
			new Card("Eight","Diamonds"),
			new Card("Nine","Diamonds"),
			new Card("Ten","Diamonds"),
			new Card("Jack","Diamonds"),
			new Card("Queen","Diamonds"),
			new Card("King","Diamonds"),
			new Card("Ace","Clubs"),
			new Card("Deuce","Clubs"),
			new Card("Three","Clubs"),
			new Card("Four","Clubs"),
			new Card("Five","Clubs"),
			new Card("Six","Clubs"),
			new Card("Seven","Clubs"),
			new Card("Eight","Clubs"),
			new Card("Nine","Clubs"),
			new Card("Ten","Clubs"),
			new Card("Jack","Clubs"),
			new Card("Queen","Clubs"),
			new Card("King","Clubs"),
			new Card("Ace","Spades"),
			new Card("Deuce","Spades"),
			new Card("Three","Spades"),
			new Card("Four","Spades"),
			new Card("Five","Spades"),
			new Card("Six","Spades"),
			new Card("Seven","Spades"),
			new Card("Eight","Spades"),
			new Card("Nine","Spades"),
			new Card("Ten","Spades"),
			new Card("Jack","Spades"),
			new Card("Queen","Spades"),
			new Card("King","Spades")};
	DeckOfCards dc_test= new DeckOfCards();
	@Test
	public void testDeckofCards(){


		Assert.assertEquals(cards.length,dc_test.deck.length);

	}
	@Test
	public void testShuffleofCards(){
		dc_test.shuffle();

		Assert.assertNotEquals(cards,dc_test.deck);

	}
	@Test
	public void testNumberofPlayers(){
		dc_test.dealCard(0);

		Assert.assertEquals(0,dc_test.Error_MSG.compareTo("Invalid Number of Players"));

	}

	@Test
	public void testNumberofPlayersMax(){
		dc_test.dealCard(53);

		Assert.assertEquals(0,dc_test.Error_MSG.compareTo("Invalid Number of Players"));

	}
	/*Exact value of shuffle array cannot be compared as Math.random function is used for shuffling and same goes for distribution of cards*/
	/*public static void main(String[] args) {
		System.out.println("Press Enter to make a new deck.");
		in.nextLine();
		DeckOfCards dc= new DeckOfCards();
		for(int i = 0; i < dc.deck.length; i++) 
	    System.out.println(dc.deck[i]);
	    System.out.println("Press Enter to shuffle the deck.");
	    in.nextLine();
		dc.shuffle();
		System.out.println("\nA shuffled deck.\n");
	    for(int i = 0; i < dc.deck.length; i++) 
	        System.out.println(dc.deck[i]);
	    System.out.println("How many players among which we want to distribute the cards");
	    int number_of_players = in.nextInt();
	    in.nextLine();
	    dc.dealCard(number_of_players);



	}
	 */
}
