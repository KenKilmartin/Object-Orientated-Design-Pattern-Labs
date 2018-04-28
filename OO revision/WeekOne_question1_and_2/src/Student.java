
/**
 * @author Ken
 *
 */
public class Student {

	/**
	 *  assigning variable names and types
	 */
	private String name,adress,course,studentNumber;    
	private int phoneNumber;
  
	/**
	 *  this is default constructor if no values are entered this is what will pop up
	 */	
	public Student() {
		
		name = "IM DEFAULT";
		adress = "STILL DEFAULT";
		course = "YOU GUESSED IT IM STILL DEFAULT ";
		studentNumber = "DEFAULT";
		phoneNumber = 123456789;
		
		
	}
	/**
	 * 
	 * @param name
	 * @param studentNumber
	 * @param phoneNumber
	 * @param address
	 * @param course
	 * 
	 * This is user defined constructors 
	 */
    
	public Student(String name,String studentNumber,int phoneNumber,String address,String course ) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.studentNumber = studentNumber;
		this.phoneNumber = phoneNumber;		
		this.adress = address;
		this.course = course;
	}


	public int getPhoneNumeber() {
		return phoneNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
	
	public String getAddress() {
		return adress;
	}

	
	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

		
	
}
