			cards[i] = new Card(Card.ranks[i], "♦");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
			cardsRank[i] = cards[i].rank;
			
		}
		
		for (Card card : cards) {
			deckValue += card.rankValue;
			
		}
		deckValue = checkStraight();
	}
	
	public int checkStraight() {
		for (int i = 0; i < Card.ranks.length; i++) {
			
			String[] sample = Arrays.copyOfRange(Card.ranks, i, i+5);
			if (Arrays.equals(sample, cardsRank)) {
				
				for (int j = 1; j < cards.length; j++) {
					if (cards[j].suit != cards[j - 1].suit) {
						break;
					}
					
					if (j == (cards.length - 1)) return 9;
				}
				
				return 4;
			}
		}
		return 0;
	}
	
	
	public int checkFlush() {
		for (int i = 1; i < 5; i++) {
			if (cards[i-1].suit == cards[i].suit) {
				if (i == 4) {
					if (deckValue >= 55) {
						return 10;
					} else {
						return 5;
					}
				}
			} else {
				break;
			}
		}
		return 0;
	}
}
=======
>>>>>>> 1056888... the flush is working now
=======
>>>>>>> 1056888... the flush is working now
=======
>>>>>>> 1056888... the flush is working now
=======
>>>>>>> 1056888... the flush is working now
=======
>>>>>>> 1056888... the flush is working now
