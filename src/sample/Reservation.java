package sample;

public class Reservation {

    public Reservation(Trip trip, Passenger passenger) {
        this.booking = booking;
        this.passenger = passenger;
        this.trip = trip;
    }

    private Booking booking;
    private Passenger passenger;
    private Trip trip;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }


    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
