package com.skilldistillery.common.cards;

public class Dealer extends BlackJackHand {

	private String dealerName;

	public Dealer() {

		super();

		// Initialize the dealer's name
		dealerName = "Dealer";

	}

	// setters and getters
	public String getName() {

		return dealerName;
	}

	public void setName(String dealerName) {

		this.dealerName = dealerName;
	}

	public boolean dealerTurn(int dealerScore, int playerScore) {

		if (dealerScore < playerScore) {

			return true;

		}

		else {
			return false;

		}

	}

	public boolean dealerWin(int dealerScore, int playerScore, String playerStays) {

		if (dealerScore == 21) {

			return false;
		} else if (playerScore > 21) {

			return false;
		}

		else if (playerScore < dealerScore) {

			if (dealerScore >= 17) {

				return false;
			}

		} else if (playerStays.equals("stay")) {

			if (dealerScore > playerScore) {

				return false;
			}
		}
		return true;

	}

	@Override
	public String toString() {

		return getName() + "'s card hand is: " + super.toString();
	}

}