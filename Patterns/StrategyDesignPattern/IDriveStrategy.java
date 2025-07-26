
public interface IDriveStrategy {
    
    public void drive();
}


class Vehicle{

    IDriveStrategy vehicleObj;
    
    Vehicle(IDriveStrategy obj){
        this.vehicleObj = obj;
    }

    void drive(){
        vehicleObj.drive();
    }
}

class NormalDrive implements IDriveStrategy{

    public void drive(){
        System.out.println("Normal drive");
    }
}

class SportDrive implements IDriveStrategy{

    public void drive(){
        System.out.println("Sports drive");
    }
}