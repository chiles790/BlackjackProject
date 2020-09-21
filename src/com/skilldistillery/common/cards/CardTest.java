package com.skilldistillery.common.cards;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		do {

			Player player = new Player();

			ArrayList<Card> playerHand = player.getHand();

			int playerScore = 0;

			int playerTotalCards = 0;

			String playerStatus = "";

			Dealer dealer = new Dealer();

			ArrayList<Card> dealerHand = dealer.getHand();

			// Initialize score and total cards in hand to 0
			int dealerScore = 0;

			int dealerTotalCards = 0;

			String dealerStatus = "";

			Hand Hand = new Hand(player.getName(), dealer.getName());

			String winnerOfGame = "";

			Deck deck = new Deck();

			// Begin the game of BlackJack

			// Shuffles deck
			Deck.shuffle();

			Card playerCard = Deck.dealCard();

			player.addCard(playerCard);

			Card dealerCard = Deck.dealCard();

			dealer.addCard(dealerCard);

			// For the initial draw, display the cards drawn by the dealer and player
			Deck.initialDrawPlayer(player.getName(), playerCard);
			Deck.initialDrawDealer(dealer.getName(), dealerCard);

			// The player is now given the option to either 'Hit' or 'Stay'

			String playerChoice;

			playerChoice = Hand.hitOrStay();

			// Loop of choice hit
			while (playerChoice.equals("hit")) {

				player.addCard(Deck.dealCard());

				playerScore = Hand.totalScore(playerHand);

				playerTotalCards = player.getNumOfCards();

				playerStatus = Hand.gameStatus(playerScore, playerTotalCards, player.getName());

				System.out.println(player);
				System.out.println(player.getName() + "'s score is: " + playerScore);

				if (playerStatus.equals("Continue")) {

					playerChoice = Hand.hitOrStay();
				} else {

					break; // ends player loop

				}
			}

			while (dealer.dealerTurn(dealerScore, playerScore)) {
					//dealer while loop
				if (dealer.dealerWin(dealerScore, playerScore, playerChoice)) {

					dealerScore = Hand.totalScore(dealerHand);

					dealerTotalCards = dealer.getNumOfCards();

					dealerStatus = Hand.gameStatus(dealerScore, dealerTotalCards, dealer.getName());

					if (dealerStatus.equals("Continue")) {

						dealer.addCard(Deck.dealCard());
					}
					else {

						break;// ends dealer loop
					} 

				}
			}
			System.out.println(dealer.getName() + "'s Turn: ");
			System.out.println();

			winnerOfGame = Hand.isWin(playerStatus, dealerStatus, dealerScore, playerScore);

			System.out.println(player.getName() + "'s score is: " + playerScore);
			System.out.println(player + "\n");

			System.out.println(dealer.getName() + "'s score is: " + dealerScore);
			System.out.println(dealer);

			System.out.println(winnerOfGame);
			System.out.println();

//			}

		} while (playAgain());

	}

	public static boolean playAgain() {
//prompting replay of blackjack
		Scanner playAgain = new Scanner(System.in);

		String answer;

		System.out.print("Enter Yes to play again, or exit to quit: ");
		answer = playAgain.next();
		if (answer.equals("yes")) {
			return true;
		}

		//
		else {
			return false;
		}

	}

}
