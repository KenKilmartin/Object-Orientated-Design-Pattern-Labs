
public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Student1 = new Student("Ken Kilmartin", "B00091252",123456, "123 Dublin Street", "Computer Science Degree");
		Student Student2 = new Student();
		
		
		
		
		System.out.println("\nThe Student name is "+ Student1.getName() + " The Student number is "+ Student1.getStudentNumber());
		System.out.println("The Student can be reached on " + Student1.getPhoneNumeber()+ " and lives in " + Student1.getAddress() );
		System.out.println("The Student is attending a "+ Student1.getCourse());
		System.out.println("*************************************************************************** \n");
		
		System.out.println("The Student name is "+ Student2.getName() + " The Student number is "+ Student2.getStudentNumber());
		System.out.println("The Student can be reached on " + Student2.getPhoneNumeber()+ " and lives in " + Student2.getAddress() );
		System.out.println("The Student is attending a "+ Student2.getCourse());
		System.out.println("*************************************************************************** \n");
			

	}

}
