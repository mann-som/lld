package CarRental;
import java.util.Date;

import CarRental.Product.Vehicle;

public class Reservation {
    
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date fromDate;
    Date toDate;
    Long fromTimestamp;
    Long toTimestamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReservation(User user, Vehicle vehicle){

        reservationId = 1234;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = reservationType.DAILY;
        reservationStatus = reservationStatus.SCHEDULED;
        return reservationId;
    }
}
