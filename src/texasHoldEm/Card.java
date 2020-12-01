package texasHoldEm;

import java.util.*;
public class Card {
	String rank;
	String suit;
	int rankValue;
	
	static String[] ranks = {"Jkr", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
	static String[] suits = {"♦", "♣", "♥", "♠"};
	Card(String rank, String suit) {
//		this.rank = ranks[new Random().nextInt(ranks.length)];
//		this.suit = suits[new Random().nextInt(suits.length)];
		
		this.rank = rank;
		this.suit = suit;
		
		
		this.rankValue = Arrays.asList(ranks).indexOf(this.rank);
		
		
	}
	
	public String getCard() {
		return this.rank + this.suit;
	}
	
}
