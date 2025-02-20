package observer;

public class MainClass {

    public static void main(String[] args) {

        IObservers mobile = new Phone();
        IObservers radio = new Radio();


        IObservable observable = new WeatherStation();
        observable.addObserver(mobile);
        observable.addObserver(radio);

        observable.setUpdate(100);
        observable.setUpdate(0);
        observable.setUpdate(10);

    }

}
