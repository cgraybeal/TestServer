
public abstract class Operation {
	protected String myName;
	public abstract int perform();
	public abstract void update(int x, int y);
	
	
	public boolean isThisKind(String s)
	{
		
		if(myName.equals(s))
		{
			return true;
		}
		return false;
	}
	
	

}
