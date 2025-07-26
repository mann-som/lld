

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new SportsVehicle());
        vehicleList.add(new PassengerVehicle());

        for(Vehicle v:vehicleList){
            v.drive();
        }
    }
}
