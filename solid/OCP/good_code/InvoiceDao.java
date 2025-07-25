package solid.OCP.good_code;

public interface InvoiceDao {
    public void save();
}

/* the better way to keep it open for extension but close for modification is to use interfact - in cpp equivalent is pure virtual function

inreface define that if a class inherits it then it has to implement it's function. so inheriting a interface to multiple class that overrides it's functions (polymorphism)
we can extend without disturbing already existing functions

*/

class InvoiceDaoDB implements InvoiceDao{
    
    @Override
    public void save(){
        // logic to save to db
    }
}

class InvoiceDaoPDF implements InvoiceDao{

    @Override
    public void save(){
        // logic to make it pdf
    }
}

class InvoiceDaotxt implements InvoiceDao{

    @Override
    public void save(){
        // logic to save
    }
}

// just like this we can keep extending the features without disturbing indepedent features