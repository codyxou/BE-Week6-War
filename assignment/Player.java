package assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//declare name and score variables 
	private String name;
	private int score;
	
	List<Card> hand = new ArrayList<Card>();

	
	public Player (String name) {
		this.setName(name);
		this.setScore(0); //starts the score as 0 when a new player is instantiated 
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("Name: " + this.name);
		System.out.println("Score: " + this.score );
	}
	
	
	public void draw(Deck deck) {
		
			//assigning variable drawCard to use the draw method specified in the Deck class which takes the top card of the shuffled deck
			Card drawCard = deck.draw();
			
			//adding to the hand Arraylist declared above
			this.hand.add(drawCard);
			
	}
	
	public Card flip() {
		Card hand = this.hand.remove(0);
		return hand;
	}
	
	public void incrementScore() {
		this.score++;
		
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
}
