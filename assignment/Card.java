package assignment;

public class Card {
	
	private String suit;
	private int value;
	private String face;

	public Card (String suit, int value, String face) {
		this.setSuit(suit);
		this.setValue(value); 
		this.setFace(face);
	}

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

}
