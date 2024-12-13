package vehicles.models;

public class Minibus extends Vehicle {
    public Minibus(String licensePlate, int rentalDay, int numberSeats) {
        super(licensePlate, rentalDay, numberSeats);
    }

    @Override
    public double getPrice() {
        return (10 * rentalDay) + (2 * numberSeats);

    }

    @Override
    public String toString() {
        return "Minibus{} " + super.toString();
    }
}
