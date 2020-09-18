package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private static List<Card> cards;

	public Deck() {
//		cards = createDeck();
		cards = new ArrayList<> (52);
		for (Suit S : Suit.values()) {
			for (Rank R : Rank.values()) {
				cards.add(new Card(R, S));
			}
		}
	}

	public static int checkDeckSize() {
		return cards.size();
	}

	public static Card dealCard() {
		return cards.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

}
//jeremys version
//	public class Deck {
//		private List<Card> cards;
//		public Deck() {
//			cards = new ArrayList<>(52);
//			for (Suit suit : Suit.values()) {
//				for (Rank rank : Rank.values()) {
//					cards.add(new Card(suit, rank));
//				}
//			}
//		}
//		public int checkDeckSize() {
//			return cards.size();
//		}
//		public Card dealCard() {
//			return cards.remove(0);
//		}
//		public void shuffle() {
//			Collections.shuffle(cards);
//		}
//	}