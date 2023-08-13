package assignment;

public class App {

	public static void main(String[] args) {
		
		//Instantiate deck and shuffle. describe method checks the cards are made properly and counts the total amount of cards
		Deck deck = new Deck();
		deck.shuffle();
		deck.describe();
//		Card drawnCard = deck.draw();	
		System.out.println("Total amount of cards created: " + deck.getCards().size());
		System.out.println("--------------");
//		drawnCard.describe();
		
		Player player = new Player("Hans");
		Player player2 = new Player("Janice");
		player.describe();

		System.out.println("------------------");
		player2.describe();

		//I would get an error when trying to put 52 into the loop. when declaring 26 in the variable numCards, I was able to use that in the loop and get even distribution of cards within the loop
		int numCards = 26;
		
		//cards drawn into respective hand arrays
		for (int i = 0; i < numCards; i++) {
			player.draw(deck);
			player2.draw(deck);
		}
		System.out.println("-------------------------------------------");
		
		System.out.println(player.getName() + "'s hand: " + player.hand);
        System.out.println(player2.getName() + "'s hand: " + player2.hand);
        System.out.println("-------------------------------------------");
		
        
        //War Game
        
        //set round count. For loop with numCards*2 as the parameter so it goes through all 52 cards.
        int round = 1;
		for (int i =0; i< numCards*2; i++) {
			
			//kept getting a out of bounds exception despite the code running properly. I did some research and adding some boolean logic to check if any hand is empty before initiating the flip method for each player got rid of the error. 
			if (!player.hand.isEmpty() && !player2.hand.isEmpty()) {
			Card player1Card = player.flip();
			Card player2Card = player2.flip();
			
			if(player1Card.getValue() > player2Card.getValue()) {
				System.out.println(player.getName() + " plays " + player1Card + " " + player2.getName() + " plays " + player2Card);
				System.out.println(player.getName() + " wins this round");
				player.incrementScore();
				System.out.println("Round: "+ round + " Player 1 Score: " + player.getScore() + " Player 2 Score: " + player2.getScore());
				
				
				System.out.println("-------------------------------------------");
				
			} else if (player1Card.getValue() < player2Card.getValue()) {
				System.out.println(player.getName() + " plays " + player1Card + " " + player2.getName() + " plays " + player2Card);
				System.out.println(player2.getName() + " wins this round");
				player2.incrementScore();
				System.out.println("Round: "+ round + " Player 1 Score: " + player.getScore() + " Player 2 Score: " + player2.getScore());
				System.out.println("-------------------------------------------");
				
				
			} else {
				System.out.println("Tie!");
				System.out.println("Round: "+ round + " Player 1 Score: " + player.getScore() + " Player 2 Score: " + player2.getScore());
				System.out.println("-------------------------------------------");
				
			}
			//Increase round number for each iteration 
			round++;
		}
		}
		
		//Overall who wins Logic. Added the names of the players to make the game feel more personal 
		
		if (player.getScore() > player2.getScore()) {
			System.out.println(player.getName() + " wins the War!");
		} else if (player2.getScore() > player.getScore()) {
			System.out.println(player2.getName() + " wins the War!");
		} else {
			System.out.println("Tie!");
		}
		
		


	}

}
