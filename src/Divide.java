

public class Divide extends Operation{
	private int myX;
	private int myY;
	
	public Divide()
	{
		myName = "divide";
	}


	public int perform() {
		return myX/myY;
	}
	
	public void update(int x, int y)
	{
		myX = x;
		myY = y;
	}

}
