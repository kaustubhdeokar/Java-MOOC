package observer;

public interface IObservable {

    void addObserver(IObservers observer);
    void removeObserver(IObservers observers);
    void notifyObservers();
    void setUpdate(int data);
    int getUpdate();

}
