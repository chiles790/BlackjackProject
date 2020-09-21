package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {

	// Declare player and dealer
	private String playerName;
	private String dealerName;

	// constructer
	public Hand(String playerName, String dealerName) {

		this.playerName = playerName;
		this.dealerName = dealerName;

	}

	public Hand() {
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String hitOrStay() {

		Scanner input = new Scanner(System.in);

		String answer;

		// Ask player to hit or stay
		System.out.print(playerName + " would you like to hit or stay ");
		answer = input.next();

		if (answer.equals("Hit") || answer.equals("hit")) {
			// ensure program coontinues with capital H and lower.
			return "hit";
		}

		else if (answer.equals("S") || answer.equals("s")) {
// same as above for H. now S for stay.
			return "stay";
		}

		else {
			return "null";
		}

	}

	public int totalScore(ArrayList<Card> hand) {
		int total = 0;

		for (Card eachCard : hand) {

			int cardValue = eachCard.getValue();

			total = total + cardValue;

		}
		return total;
	}

	public String gameStatus(int score, int totalCards, String name) {

		for (int i = 1; i <= 5; i++) {
			if (score >= 21) {

				if (score > 21) {

					return "Bust";
				}

				else {

					return "Win";
				}

			}

		}
		return "Continue";
	}

	public String isWin(String playerStatus, String dealerStatus, int dealerScore, int playerScore) {

		if (!(playerStatus.equals("Bust")) && !(dealerStatus.equals("Bust"))) {

			// If the players score is greater, return player is winner
			if (playerScore > dealerScore) {

				return "The winner is " + getPlayerName();
			}

			// If delaer is greater then return dealer wins
			else if (playerScore < dealerScore) {

				return "The winner is " + getDealerName();
			}

			else {
				return "It's a draw!";
				// else used due to draw being the only other outcome.
			}

		}

		else if (playerStatus.equals("Bust")) {
			return getPlayerName() + " Busts! " + getDealerName() + " won!";
		} else {
			return getDealerName() + " Busts! " + getPlayerName() + " won!";
		}
	}
}