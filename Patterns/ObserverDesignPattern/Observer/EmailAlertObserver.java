package Patterns.ObserverDesignPattern.Observer;

import Patterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    
    String emailID;
    StockObservable observable;

    public EmailAlertObserver(StockObservable observable, String emailId){
        this.observable = observable;
        this.emailID = emailId;
    }

    @Override
    public void update(){
        sendEmail(emailID, "Product is back in stocks.");
    }

    public void sendEmail(String emailID, String msg){
        System.out.println("Mail sent to : "+ emailID);
    }
}
