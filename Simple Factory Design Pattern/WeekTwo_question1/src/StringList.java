import java.util.StringTokenizer;

public class StringList extends NumberList {

	int size;

	StringList(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		string_list = new String[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			string_list[i] = token.nextToken();
		}
	}
	
	public void display()
	{
		System.out.println("String List");	
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + string_list[i]);
	}

}
