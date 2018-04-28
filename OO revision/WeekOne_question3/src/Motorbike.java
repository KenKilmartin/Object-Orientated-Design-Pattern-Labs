
public class Motorbike extends Car {
	
	private Boolean Carrier;

	public Motorbike(String Colour, String Type, int EngineSize, double NetPrice, int numberOfDoors,Boolean Carrier) {
		super(Colour, Type, EngineSize, NetPrice, numberOfDoors);
		// TODO Auto-generated constructor stub
		this.Carrier = Carrier;
	}

	public Boolean getCarrier() {
		return Carrier;
	}

	public void setCarrier(Boolean carrier) {
		Carrier = carrier;
	}
	
	public double getVRT() {
		double vrt = this.getNetPrice() * 0.13;
		
		return vrt;
		
		
	}
	

}
