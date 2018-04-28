import java.util.StringTokenizer;

public class Invest_list extends AccountList {
int size;
	
Invest_list(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		invest_list = new String[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			invest_list[i] = token.nextToken();
		}
	}
	
	public void display()
	{
		System.out.println("Investment account List is :  ");		
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + invest_list[i]);
	}
}
