package game.model;

public class Rock extends GameChoice
{
	int winFactor;
	
	public Rock(int winFactor)
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
