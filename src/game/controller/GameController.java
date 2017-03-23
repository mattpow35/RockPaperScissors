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
		boolean keepPlaying = true;
		while(keepPlaying)
		{
			chooseUserSelection();
		
		
			if(continueGame())
			{
				chooseComSelection();
				if (getWinner().equals("user"))
				{
					System.out.println("You win!");
					wins +=1;
				}
				else if(getWinner().equals("com"))
				{
					System.out.println("You lose!");
					losses +=1;
				}
				else if(getWinner().equals("tie"))
				{
					System.out.println("You tied!");
					ties += 1;
				}
				System.out.println("Your record is: \n Wins: " + wins + "\n Losses: " + losses + "\n Ties: " + ties);
			}
			else
			{
				System.out.println("You must type in a valid selection.");
			}
			
			
			System.out.println("Do you want to try again? (type no to stop)");
			String response = input.nextLine();
			if (response.equalsIgnoreCase("no"))
			{
				keepPlaying = false;
				System.out.println("Thanks for playing!");
			}
		}
	}
	
	public void chooseUserSelection()
	{
		System.out.print("What is your selection? ");
		
		String currentChoice = input.nextLine();
	
		if(currentChoice.equalsIgnoreCase("p"))
		{
			user = new Paper(2);
			System.out.println("You chose Paper!");
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
			user = new Rock(0);
			user.setWinFactor(0);

		}
		System.out.println("Press enter for the computers selection");
		input.nextLine();
	}
	
	public boolean continueGame()
	{
		boolean playGame  = false;
		
		if(user.getWinFactor() != 0)
		{
			playGame = true;
		}
		
		return playGame;
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
	
	private String getWinner()
	{
		String winner = "";
		
		if(user.getWinFactor() == com.getWinFactor())
		{
			winner = "tie";
		}
		else if(user.getWinFactor() == 1 && com.getWinFactor() == 2)
		{
			winner = "com";
		}
		else if(user.getWinFactor() == 2 && com.getWinFactor() == 3)
		{
			winner = "com";
		}
		else if(user.getWinFactor() == 3 && com.getWinFactor() == 1)
		{
			winner = "com";
		}
		else if(user.getWinFactor() == 1 && com.getWinFactor() == 3)
		{
			winner = "user";
		}
		else if(user.getWinFactor() == 2 && com.getWinFactor() == 1)
		{
			winner = "user";
		}
		else if(user.getWinFactor() == 3 && com.getWinFactor() == 2)
		{
			winner = "user";
		}
		
		return winner;
		
	}

}
