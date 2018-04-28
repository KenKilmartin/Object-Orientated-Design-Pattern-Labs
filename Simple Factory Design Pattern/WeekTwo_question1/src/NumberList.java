
public abstract class NumberList
{
	protected int[] int_list;
	protected double[] double_list;
	protected String[] hex_list;
	protected String[]string_list;

	NumberList()
	{
		int_list = null;
		double_list = null;
		hex_list = null;
		string_list = null;
	}

	public int[] getIntList() {return int_list;}
	public double[] getDoubleList() {return double_list;}
	public void display() {}
	public Number sum() {return null;}
}









