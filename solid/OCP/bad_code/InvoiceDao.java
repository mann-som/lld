package solid.OCP.bad_code;

public class InvoiceDao {
    
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(){
        // logic to save to db
    }
}

// Let's say i need to add one more functionality in this class to handle invoice dao - saveToPDF()
/*
public class InvoiceDao {
    
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(){
        // logic to save to db
    }

    public void saveToPDF(){
        logic to save pdf   -----> we can add the feature like this but it violates the OCP that is : a class should be open for extension but close for modification
    }
}
*/ 