package solid.ISP.bad_code;

public class Employees {
    
}
 

class waiter implements Restaurant{

    public void cookFood(){
        // this is not my job
    }

    public void washDishes(){
        // again not my job
    }

    public void serverCustomers(){
        // yeah that's my job
    }
}

// here violation of ISP is that class inheriting the restaurant have to inherit unnecessary functions that are not it's work