package vehicles.models;

public class Car extends Vehicle {

    public Car(String licensePlate, int rentalDay, int numberSeats) {
        super(licensePlate, rentalDay, numberSeats);
    }

    @Override
    public double getPrice() {
        return (10 * rentalDay) + (1.5 * numberSeats * rentalDay);
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}