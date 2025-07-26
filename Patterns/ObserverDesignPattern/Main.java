package Patterns.ObserverDesignPattern;

import Patterns.ObserverDesignPattern.Observable.StockObservable;
import Patterns.ObserverDesignPattern.Observable.iPhoneObservable;
import Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;
import Patterns.ObserverDesignPattern.Observer.EmailAlertObserver;
import Patterns.ObserverDesignPattern.Observer.MobileAlertNotification;
import Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {
    
    public static void main(String args[]){

        StockObservable iphoneStockObservable = new iPhoneObservable();
        
        NotificationAlertObserver observer1 = new EmailAlertObserver(iphoneStockObservable, "xyz@abc.com");
        NotificationAlertObserver observer2 = new EmailAlertObserver(iphoneStockObservable, "xy2z@abc.com");
        NotificationAlertObserver observer3 = new MobileAlertNotification(iphoneStockObservable, "user");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(11);
    }
}
