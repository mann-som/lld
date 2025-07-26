package solid.LSP.good_code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Bicycle());

        for(Vehicle v:vehicleList){
            System.out.println(v.noOfWheels());
        }
    }

}
