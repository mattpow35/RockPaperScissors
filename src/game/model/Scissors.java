package game.model;

public class Scissors extends GameChoice
{
	int winFactor;
	
	public Scissors(int winFactor)
	{
		super(winFactor);
	}
	
	public int getWinFactor() {
		return winFactor;
	}

	public void setWinFactor(int winFactor) {
		this.winFactor = winFactor;
	}

	

}
