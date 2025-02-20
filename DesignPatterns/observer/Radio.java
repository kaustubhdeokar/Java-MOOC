package observer;

public class Radio implements IObservers{
    @Override
    public void update() {
        System.out.println("radio observer updated.");
    }
}
