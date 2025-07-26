package Patterns.ObserverDesignPattern.Observable;

import Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObserver();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
