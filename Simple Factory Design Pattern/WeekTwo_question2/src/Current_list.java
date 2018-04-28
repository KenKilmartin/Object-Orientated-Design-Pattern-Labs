import java.util.StringTokenizer;

public class Current_list extends AccountList {

	int size;
	
	Current_list(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		current_list = new String[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			current_list[i] = token.nextToken();
		}
	}
	
	public void display()
	{
		System.out.println("Current account List is :  ");		
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + current_list[i]);
	}
}


