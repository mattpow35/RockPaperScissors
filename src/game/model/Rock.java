package game.model;

public class Rock extends GameChoice
{
	int winFactor;
	
	public Rock()
	{
		super(1);
	}

	
	public int getWinFactor() {
		return winFactor;
	}

	public void setWinFactor(int winFactor) {
		this.winFactor = winFactor;
	}

	
	
	
}
