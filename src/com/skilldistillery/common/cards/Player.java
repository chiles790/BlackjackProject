package com.skilldistillery.common.cards;
import java.util.Scanner;

public class Player extends BlackJackHand {
	
	private String playerName;
	
	public Player(){
		
		super();
		
		Scanner pInput = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		playerName = pInput.next();
	// added to give yourself nickname
	}
	//setters and getters for name
	public String getName(){
		
		return playerName;
	}
	
	
	public void setName(String playerName){
		
		this.playerName = playerName;
	}	
	
	@Override
	public String toString(){
		
		return getName() + "'s card hand is: " + super.toString();
	}
}