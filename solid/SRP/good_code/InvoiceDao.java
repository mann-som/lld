package solid.SRP.good_code;

public class InvoiceDao {
    
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(){
        // logic to save to db
    }
}
