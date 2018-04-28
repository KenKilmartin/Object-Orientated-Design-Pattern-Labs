
public abstract class AccountList
{

	protected String[] current_list;
	protected String[] invest_list;

	AccountList()
	{
		
		current_list = null;
		invest_list = null;
	}

	public String[] getCurrentList() {return current_list;}
	public String[] getInvestList() {return invest_list;}
	public void display() {}
	
}








