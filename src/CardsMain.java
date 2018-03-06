
import java.util.Scanner;


public class CardsMain {


	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
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

}



