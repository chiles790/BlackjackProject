package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
		private static List<Card> cards;
		public Deck() {
			cards = new ArrayList<>(52);
			for (Suit S : Suit.values()) {
				for (Rank R : Rank.values()) {
					cards.add(new Card(R, S));
				}
			}
		}
		public int checkDeckSize() {
			return cards.size();
		}
		public static Card dealCard() {
			return cards.remove(0);
		}
		public static void shuffle() { 
			Collections.shuffle(cards);
			System.out.println("Deck is shuffled"); // added this print out to show the user that the deck is 
			//shuffled after each round.
			
		}
		
		public static void initialDrawPlayer(String name, Card card){
			
			System.out.println(name + " draws " + card + ".");
		}
		// split above and below to easily print both players cards but keep dealers 2nd card a secret
		public static void initialDrawDealer(String name, Card card){
			
			System.out.println(name + " draws " + card + ".");
		}
		}