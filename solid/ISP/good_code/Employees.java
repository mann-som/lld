package solid.ISP.good_code;

public class Employees {
    
}

class Waiter implements WaiterInterface{

    public void serverCustomers(){
        // yeah it's my job
    }
    public void takeOrders(){
        // perfect
    }
}
class Chef implements ChefInterface{

    public void cookFood(){
        // gonna cook it
    }

    public void decideMenu(){
        // eat me
    }
}

// now interface is devided into smaller parts specific to required jobs