

public class NumberFactory
{
	public NumberList getNumberList(String list)
	{
		// Check for  existence of '.'
		int i = list.indexOf('.');
		if (i == 1)
		{
			return new DoubleList(list);
		}


		int a = list.indexOf('x');
		if (a == 1)
		{
			return new HexList(list);
		}
		int b = list.indexOf('A');
		if (b == 0)
		{
			return new StringList(list);
		}

		return new IntList(list);

	}

}




