package texasHoldEm;
import java.util.*;
public class Deck {
	Card[] cards = new Card[5];
	int deckValue;
	String[] cardsValue = new String[5];
	
	Deck() {
		for (int i = 0; i < 5; i++) {
			cards[i] = new Card(Card.ranks[i], "♦");
			cardsValue[i] = cards[i].rank;
		}
		
		for (Card card : cards) {
			deckValue += card.rankValue;
			
		}
		deckValue = checkStraight();
	}
	
	public int checkStraight() {
		for (int i = 0; i < Card.ranks.length; i++) {
			
			String[] sample = Arrays.copyOfRange(Card.ranks, i, i+5);
			if (Arrays.equals(sample, cardsValue)) {
				
				for (int j = 1; j < cards.length; j++) {
					if (cards[j].suit != cards[j - 1].suit) {
						break;
					}
					
					if (j == (cards.length - 1)) return 9;
				}
				
				return 5;
			}
		}
		return 0;
	}
}
