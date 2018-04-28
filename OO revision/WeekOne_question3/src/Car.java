
public class Car extends Vehicle{
	
	private int numberOfDoors;

	public Car(String Colour, String Type, int EngineSize, double NetPrice,int numberOfDoors) {
		super(Colour, Type, EngineSize, NetPrice);
		
		this.numberOfDoors= numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
