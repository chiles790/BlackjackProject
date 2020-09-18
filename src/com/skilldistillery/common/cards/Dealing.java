package com.skilldistillery.common.cards;

import java.util.Scanner;



public class Dealing {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner kb = new Scanner(System.in);
		System.out.println("How many cards? ");
		
		try {
			int num = kb.nextInt();
			if(num> Deck.checkDeckSize()) {
				System.out.println("Too many cards");
			}else {
				int value = 0;
				for (int i = 0; i < num; i++) {
					Card c = Deck.dealCard();
					value += c.getValue();
				}
				System.out.println("Your value is " + value);
			}
		}
			catch(Exception e) {
			System.out.println("Please enter a number");
		}
		
		
//		  Scanner kb = new Scanner(System.in);
//		  System.out.println("How many cards?");
//		  try {
//			int num = kb.nextInt();
//			if(num > deck.checkDeckSize()) {
//				System.out.println("Too many cards");
//			} else {
//				int value = 0;
//				for(int i = 0; i < num; i++) {
//					Card c = deck.dealCard();
//					value += c.getValue();
//					System.out.println(c);
//				}
//				System.out.println("Your value is " + value);
//			}
//		} catch (Exception e) {
//			System.out.println("Please enter a number.");
//		}
//	  }
//	}
//		jeremeys version
//	11:35
//	package com.skilldistillery.common.cards;
//	import java.util.ArrayList;
//	import java.util.Collections;
//	import java.util.List;
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
//
		
		
		
		
		
	}

}
