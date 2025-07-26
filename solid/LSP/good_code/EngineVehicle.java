package solid.LSP.good_code;

public class EngineVehicle extends Vehicle {
    
    public boolean hasEngine(){
        return true;
    }
}

// now this class does follows LSP as it is extending the functionality of parent class and not limiting it

