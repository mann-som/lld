package solid.LSP.bad_code;

/*
if class A 
 
*/

interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;

    public void turnOnEngine(){

        isEngineOn = true;
    }

    public void accelerate(){
        speed = speed + 10;
    }

}

class Bicycle implements Bike{

    int speed;

    public void turnOnEngine(){
        // but this function is restricted here. so it brings down the functionlity of the parent class. it violates the LSP which says:
        //    the derived class should expands the functions of the parent class not restrict it
    }
    public void accelerate(){
        speed = speed + 1;
    }
}

