public class VeggieGarden extends Garden {
    public Plant getShade() {
        return new Plant("Broccoli"," ph 2.2");
    }
    public Plant getCenter() {
        return new Plant("Corn"," ph 3.2");
    }
    public Plant getBorder() {
        return new Plant("Peas", " ph 4.5");
    }
    public Plant getSoil() {
    	return new Plant("muck", " ph 3.5");
    }

}
