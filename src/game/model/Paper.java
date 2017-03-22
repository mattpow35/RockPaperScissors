package game.model;

public class Paper extends GameChoice
{
	int winFactor;
	
	public Paper(int winFactor)
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
