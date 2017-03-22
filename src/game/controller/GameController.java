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
	
	private GameChoice user;
	private GameChoice com;
	
	private Scanner input;
	
	public GameController()
	{
		input = new Scanner(System.in);
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
		
		System.out.println(user.getWinFactor());
	}
	
	public void chooseUserSelection()
	{
		System.out.print("Your choice: ");
		
		String currentChoice = input.nextLine();
	
		if(currentChoice.equalsIgnoreCase("p"))
		{
			user = new Paper();
		}
		else if(currentChoice.equalsIgnoreCase("r"))
		{
			user = new Rock();
		}
		else if(currentChoice.equalsIgnoreCase("s"))
		{
			user = new Scissors();
		}
		else
		{
			System.out.println("Type in a valid choice");
		}
		input.nextLine();
	}
	
	public void chooseComSelection()
	{
		int random = (int) (Math.random()*3);
		
		switch(random)
		{
		case 0:
			com = new Rock();
		case 1:
			com = new Paper();
		case 2:
			com = new Scissors();
		
		}
	}

}
