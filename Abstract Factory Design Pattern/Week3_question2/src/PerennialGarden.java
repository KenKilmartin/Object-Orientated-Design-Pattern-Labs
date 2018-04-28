public class PerennialGarden extends Garden {
	public Plant getShade() {
		return new Plant("Astilbe"," muck");
	}
	public Plant getCenter() {
		return new Plant("Dicentrum"," light soil");
	}
	public Plant getBorder() {
		return new Plant("Sedum"," muck");
	}


}
