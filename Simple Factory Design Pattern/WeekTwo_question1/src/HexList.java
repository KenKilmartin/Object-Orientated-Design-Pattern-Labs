import java.util.StringTokenizer;

public class HexList extends NumberList {
	
	
	int size;
	
	HexList(String list)
	{
		size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		// Allocate some space for the array
		hex_list = new String[size];

		// Store each list item an the appropriate array
		for(int i = 0; i < size; i++)
		{
			hex_list[i] = token.nextToken();
		}
	}
	
	public void display()
	{
		System.out.println("Hex List ");		
		for(int i = 0; i < size; i++)
			System.out.println("[" + i + "] = " + hex_list[i]);
	}
}
