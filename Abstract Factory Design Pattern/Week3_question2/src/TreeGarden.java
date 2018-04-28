
public class TreeGarden extends Garden {
    public Plant getShade() {
        return new Plant("Bonsai"," ph3.4");
    }
    public Plant getCenter() {
        return new Plant("Chesnut"," ph 5.4");
    }
    public Plant getBorder() {
        return new Plant("Maple", " ph 6.2");
    }

}
