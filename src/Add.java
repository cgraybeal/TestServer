

public class Add extends Operation{
	private int myX;
	private int myY;
	
	public Add()
	{
		myName = "add";
	}


	public int perform() {
		return myX+myY;
	}
	
	public void update(int x, int y)
	{
		myX = x;
		myY = y;
	}

}
