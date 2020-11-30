package texasHoldEm;

import java.util.*;
public class Card {
	String rank;
	String suit;
	int rankValue;
	
	String[] ranks = {"Jkr", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
	String[]  suits = {"♦", "♣", "♥", "♠"};
	Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		
		
		this.rankValue = Arrays.asList(ranks).indexOf(this.rank);
		
		
	}
	
	public String getCard() {
		return this.rank + this.suit;
	}
	
}
