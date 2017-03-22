package game.model;

public class Paper extends GameChoice
{
	int winFactor;
	
	public Paper()
	{
		super(2);
	}
	
	public int getWinFactor() {
		return winFactor;
	}

	public void setWinFactor(int winFactor) {
		this.winFactor = winFactor;
	}

	

}
