package Patterns.ObserverDesignPattern.Observable;

import java.util.List;
import java.util.ArrayList;

import Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class iPhoneObservable implements StockObservable {
    
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){
        stockCount = stockCount + newStockAdded;
        System.out.println("Updated stocks: " + stockCount);
        if(stockCount > 10){
            notifyObserver();
        }
        else{
            System.out.println("Stock still less than threshold");
        }
    }

    public int getStockCount(){
        return stockCount;
    }

}
