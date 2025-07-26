package Patterns.ObserverDesignPattern.Observer;

import Patterns.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertNotification implements NotificationAlertObserver{
    
    StockObservable observable;
    String username;

    public MobileAlertNotification(StockObservable observable, String username){
        this.observable = observable;
        this.username = username;
    }

    public void update(){
        sendNotification(username, "Product is back in stocks");
    }
    
    public void sendNotification(String username, String msg){
        System.out.println("Message sent to :"+username);
    }
}
