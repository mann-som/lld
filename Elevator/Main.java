package Elevator;

public class Main {
    public static void main(String[] args){
        Elevator elevator = new Elevator(3);
        elevator.addRequest(1);
        elevator.addRequest(4);
        elevator.addRequest(7);
        elevator.addRequest(9);

        while (true) {
            elevator.steps();
            if(elevator.requests.isEmpty()) break;
        }
    }
}
