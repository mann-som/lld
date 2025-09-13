package CarRental;
import java.util.ArrayList;
import java.util.List;

import CarRental.Product.Vehicle;

public class Store {
    int storeId;
    VehicleInventoryManagement InventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(){
        return InventoryManagement.getVehicles();
    }

    public Reservation createReservation(User user, Vehicle vehicle){

        Reservation reservation = new Reservation();
        reservation.createReservation(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(){
        // we can add function in reservation to complete order that updates the status to completed and call it here
        return true;
    }
}
