package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    int someData = 0;
    List<IObservers> observersList;

    public WeatherStation() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void addObserver(IObservers observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(IObservers observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observersList.forEach(o -> o.update());
    }

    @Override
    public void setUpdate(int data) {
        if(someData == 0) notifyObservers();
        someData = data;
    }

    @Override
    public int getUpdate() {
        return someData;
    }
}
