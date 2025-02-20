package decorator.pizza;

public class ThinCrustBase implements Pizza {
    @Override
    public int getCost() {
        return 120;
    }
}
