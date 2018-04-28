


public class NumberFactoryTest
{
	public static void main(String[] args)
	{
		String list1 = new String("1 2 3 4 5 6 7 8 9 10");
		String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
		String list3 = new String("0xFF 0xAF45 0xFF4");
		String list4 = new String ("A B C D E");


		NumberFactory nfactory = new NumberFactory();


		nfactory.getNumberList(list1).display();

		System.out.println("");

		NumberList numberlist2 = nfactory.getNumberList(list2);
		numberlist2.display();

		System.out.println("");
		System.out.println("Sum of list 2 : " + numberlist2.sum());
		
		System.out.println("");
		NumberList numberlist3 = nfactory.getNumberList(list3);
		numberlist3.display();
		
		System.out.println("");
		NumberList numberlist4 = nfactory.getNumberList(list4);
		numberlist4.display();

	}
}