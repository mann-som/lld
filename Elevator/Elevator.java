package Elevator;
import java.util.*;

class Elevator {
    private int currentFloor;
    private Direction direction;
    public TreeSet<Integer> requests;

    public Elevator(int StartFloor){
        this.currentFloor = StartFloor;
        this.direction = Direction.UP;
        this.requests = new TreeSet<>();
    }

    public void addRequest(int floor){
        requests.add(floor);
    }

    public void steps(){
        if(requests.isEmpty()){
            System.out.println("No pending requests");
            return;
        }

        if(direction == Direction.UP){

            SortedSet<Integer> higher = requests.tailSet(currentFloor, false);

            if(!higher.isEmpty()){
                int nextFloor = higher.first();
                moveto(nextFloor);
            }
            else{
                direction = Direction.DOWN;
                steps();
            }
        }
        else{
            SortedSet<Integer> lower = requests.headSet(currentFloor, false);

            if(!lower.isEmpty()){
                int nextFloor = lower.last();
                moveto(nextFloor);
            }
            else{
                direction = Direction.DOWN;
                steps();
            }
        }
    }

    public void moveto(int floor){
        System.out.println("Moving to " + floor);
        currentFloor = floor;
        requests.remove(floor);
    }
}
