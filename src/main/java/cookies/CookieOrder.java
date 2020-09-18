package cookies;

public class CookieOrder {
    private int numBoxes;
    private String variety;

    public CookieOrder(String localVariety, int localNumBoxes) {
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;

    }

    public int getNumBoxes() {
        return this.numBoxes;
    }

    public String getVariety() {
        return this.variety;

    }
}
