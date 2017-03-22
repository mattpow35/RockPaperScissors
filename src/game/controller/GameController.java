package game.controller;

import game.model.GameChoice;
import game.model.Paper;
import game.model.Rock;
import game.model.Scissors;

import java.util.Scanner;

public class GameController 
{
	private int wins;
	private int losses;
	private int ties;
	
	private GameChoice user;
	private GameChoice com;
	
	private Scanner input;
	
	public GameController()
	{
		input = new Scanner(System.in);
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public void start()
	{
		System.out.println("Welcome to rock paper Scissors! Please enter your choice.");
		System.out.println("R = rock");
		System.out.println("P = paper");
		System.out.println("S = scissors");
		
		playGame();
	
	}
	
	public void playGame()
	{
		chooseUserSelection();
		chooseComSelection();
		getWinner();
	
		
		
	}
	
	public void chooseUserSelection()
	{
		System.out.print("Your choice: ");
		
		String currentChoice = input.nextLine();
	
		if(currentChoice.equalsIgnoreCase("p"))
		{
			user = new Paper(2);
			System.out.println("You chose Paper");
			user.setWinFactor(2);
		}
		else if(currentChoice.equalsIgnoreCase("r"))
		{
			user = new Rock(1);
			System.out.println("You chose Rock!");
			user.setWinFactor(1);
		}
		else if(currentChoice.equalsIgnoreCase("s"))
		{
			user = new Scissors(3);
			System.out.println("You chose Scissors!");
			user.setWinFactor(3);
		}
		else
		{
			System.out.println("Type in a valid choice");
		}
		System.out.println("Press enter for the computers selection");
		input.nextLine();
	}
	
	public void chooseComSelection()
	{
		int random = (int) (Math.random()*3);
		
		switch(random)
		{
		case 0:
			com = new Rock(1);
			System.out.println("The computer chose Rock!");
			com.setWinFactor(1);
			break;
		case 1:
			com = new Paper(2);
			System.out.println("The computer chose Paper!");
			com.setWinFactor(2);
			break;
		case 2:
			com = new Scissors(3);
			System.out.println("The computer chose Scissors!");
			com.setWinFactor(3);
			break;
		
		}
	}
	
	private void getWinner()
	{
		if(user.getWinFactor() == com.getWinFactor())
		{
			System.out.println("You tied!");
			ties += 1;
		}
		
		if(user.getWinFactor() == 1 && com.getWinFactor() == 2);
		{
			System.out.println("You lose!");
			losses -= 1;
		}
		if(user.getWinFactor() == 2 && com.getWinFactor() == 3)
		{
			System.out.println("You lose!");
			losses -= 1;
		}
		if(user.getWinFactor() == 3 && com.getWinFactor() == 1)
		{
			System.out.println("You lose!");
			losses -= 1;
		}
		
		
		
		
		if(user.getWinFactor() == 1 && com.getWinFactor() == 3)
		{
			System.out.println("You win!");
			wins += 1;
		}
		if(user.getWinFactor() == 2 && com.getWinFactor() == 1)
		{
			System.out.println("You win!");
			wins += 1;
		}
		if(user.getWinFactor() == 3 && com.getWinFactor() == 2)
		{
			System.out.println("You win!");
			wins += 1;
		}
		
	}

}
