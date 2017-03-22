package game.model;

public class Scissors extends GameChoice
{
	int winFactor;
	
	public Scissors()
	{
		super(3);
	}
	
	public int getWinFactor() {
		return winFactor;
	}

	public void setWinFactor(int winFactor) {
		this.winFactor = winFactor;
	}

	

}
