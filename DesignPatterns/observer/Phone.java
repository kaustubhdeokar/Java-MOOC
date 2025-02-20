package observer;

public class Phone implements IObservers{
    @Override
    public void update() {
        System.out.println("phone observer updated.");
    }
}
