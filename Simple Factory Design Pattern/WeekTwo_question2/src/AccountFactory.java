
public class AccountFactory {
	
	public AccountList getAccountList(String list)
	{
		
		int i = list.indexOf('C');
		if (i == 0)
		{
			return new Current_list(list);
		}
		else	
			
		return new Invest_list(list);			
	}
	
}
