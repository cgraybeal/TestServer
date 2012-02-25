import java.util.ArrayList;


public class Registry {
	private ArrayList<Operation> operationsList;
	
	public Registry()
	{
		
		operationsList = new ArrayList<Operation>();
		fillList();
	}
	
	public Operation parse(String s)
	{
		//String name = s.substring(0,s.indexOf(' ' , 0));
		String[] stuff = s.split(" ");
		Operation cur = null;
		for(Operation o: operationsList)
		{
			if(o.isThisKind(stuff[0]))
			{
				cur = o;
				break;
			}
		}
		cur.update(Integer.parseInt(stuff[1]), Integer.parseInt(stuff[2]));
		return cur;
	}
	
	public void fillList()
	{
		operationsList.add(new Multiply());
		operationsList.add(new Divide());
		operationsList.add(new Add());
		operationsList.add(new Subtract());
	}

}
