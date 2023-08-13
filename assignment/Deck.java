package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

		
		//Create arraylist for deck
		List<Card> cards = new ArrayList<Card>();
	


	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			
			//Assigns integer value
			int count = 2;
			
			//Assign String number value
			
		for (String value : values) {
			Card card = new Card(value, suit, count);
			this.cards.add(card);
			count++;
			}
		}

		
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//loops through the deck and allows us to print each card
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
		
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {
		//takes top card of shuffled deck
		Card card = this.cards.remove(0);
		return card;
	}

}



