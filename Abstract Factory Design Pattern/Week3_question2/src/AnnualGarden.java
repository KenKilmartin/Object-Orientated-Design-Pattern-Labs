public class AnnualGarden extends Garden {
    public Plant getShade() {
        return new Plant("Coleus","dark soil");
    }
    public Plant getCenter() {
        return new Plant("Marigold", "light soil");
    }
    public Plant getBorder() {
        return new Plant("Alyssum","ph 5.5");
    }

}
