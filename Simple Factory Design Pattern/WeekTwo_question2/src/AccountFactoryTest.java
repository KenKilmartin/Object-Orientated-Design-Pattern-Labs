
public class AccountFactoryTest {

	public static void main(String[] args)
	{
		String list1 = new String("C10001 C10002 C10003 ");
		String list2 = new String("I20001 I20002 I20003");


		AccountFactory afactory = new AccountFactory();


		afactory.getAccountList(list1).display();

		System.out.println("");

		AccountList accountlist2 = afactory.getAccountList(list2);
		accountlist2.display();



	}
}