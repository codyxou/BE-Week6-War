package assignment;

public class Card {
	
	//declare variables of a card
	
	private String suit;
	private int value;
	private String face;
	
	//constructor

	public Card (String suit, String face, int value) {
		this.setSuit(suit);
		this.setValue(value); 
		this.setFace(face);
	}
	
	//researched an override declaration to make the array in each of the players much more readable. 
    @Override
    public String toString() {
        return suit + " of " + face;
    }
	
	//getters and setters

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	//print what the Card and Value is 
	
	public void describe() {
		System.out.println(this.suit + " of " + this.face + " -- " + this.value);
	}
	
}


