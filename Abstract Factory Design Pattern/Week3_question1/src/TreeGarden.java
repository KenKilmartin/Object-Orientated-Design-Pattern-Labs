
public class TreeGarden extends Garden {
    public Plant getShade() {
        return new Plant("Bonsai");
    }
    public Plant getCenter() {
        return new Plant("Chesnut");
    }
    public Plant getBorder() {
        return new Plant("Maple");
    }

}
