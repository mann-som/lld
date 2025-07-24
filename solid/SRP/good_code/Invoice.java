package solid.SRP.good_code;

public class Invoice {
    
    Marker marker;
    int quantity;
    
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return this.quantity * marker.price;
    }
}

// Now following the SRP : handling the responsibilty of just calculating invoice not the interaction with database or saving the invoice