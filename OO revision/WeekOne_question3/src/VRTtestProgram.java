

public class VRTtestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Car  Car1 = new Car("Blue", "Honda", 42, 11132.00, 4);
		Motorbike Bike1 = new Motorbike("Red", "Harley", 400, 11132.00, 0, true);
		
		
		
		
		System.out.println("The Vehicle colour is : "+ Car1.getColour());
		System.out.println("The make of the car is "+ Car1.getType());
		System.out.println("The vechile has "+Car1.getNumberOfDoors()+ " doors");
		System.out.println("The amount of VRT that will need to pay is "+ Car1.getVRT());
		
		System.out.println(" ");
		
		
		System.out.println("The Vehicle colour is : "+ Bike1.getColour());
		System.out.println("The make of the bike is "+ Bike1.getType());
		System.out.println("This motorbike has a carrier: "+Bike1.getCarrier());
		System.out.println("The amount of VRT that will need to pay is "+ Bike1.getVRT()); 
	
	}

}
