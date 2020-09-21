package com.skilldistillery.common.cards;

import java.util.ArrayList;

public class BlackJackHand {
	private ArrayList<Card> cards;

	// Constructor
	public BlackJackHand() {
		cards = new ArrayList<Card>();

	}

	public void setHand(ArrayList<Card> cards) {

		this.cards = cards;
	}

	public ArrayList<Card> getHand() {
		return cards;
	}

	public void addCard(Card card) {

		cards.add(card);
	}

	public int getNumOfCards() {
		int totalCards = 0;
		for (Card eachCard : cards) {

			//
			totalCards = totalCards + 1;

		}

		return totalCards;

	}

	@Override
	public String toString() {

		return getHand() + "";
	}

}