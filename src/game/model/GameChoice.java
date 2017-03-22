package game.model;

public abstract class GameChoice 
{
	int winFactor;
	
	public GameChoice(int winFactor)
	{
		this.winFactor = winFactor;
	}

	public int getWinFactor() 
	{
		return winFactor;
	}

	public void setWinFactor(int winFactor) 
	{
		this.winFactor = winFactor;
	}

}
