

public class Multiply extends Operation{
	private int myX;
	private int myY;
	
	public Multiply()
	{
		myName = "multiply";
	}


	public int perform() {
		return myX*myY;
	}
	
	public void update(int x, int y)
	{
		myX = x;
		myY = y;
	}

}
