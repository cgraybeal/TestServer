

public class Subtract extends Operation{
	private int myX;
	private int myY;
	
	public Subtract()
	{
		myName = "subtract";
	}


	public int perform() {
		return myX-myY;
	}
	
	public void update(int x, int y)
	{
		myX = x;
		myY = y;
	}

}
