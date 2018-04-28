
public class Vehicle {
	

	private String Colour, Type;	
	private int EngineSize ;
	private double NetPrice ;
		
	public  Vehicle(String Colour, String Type, int EngineSize,double NetPrice ) {
		this.Colour = Colour;
		this.Type = Type;
		this.EngineSize = EngineSize;
		this.NetPrice = NetPrice;
	}
	
	
	public String getColour() {
		return Colour;
	}
	public String getType() {
		return Type;
	}
	public int getEngineSize() {
		return EngineSize;
	}
	public double getNetPrice() {
		return NetPrice;
	}


	public double getVRT() {
		double vrt = this.getNetPrice() * 0.21;
		
		return vrt;
		
		
	}
	
	
} 


