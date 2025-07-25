package solid.OCP.good_code;

public class Invoice {
    private Marker marker;   // an object of marker so Invoice has a "has-a" --->> relationship with marker class
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = (marker.price)* this.quantity;
        return price;
    }

    public void printInvoice(){
        // printing invoice
    }

    public void saveToDb(){
        // saving to db
    }
}
