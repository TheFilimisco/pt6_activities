package vehicles.models;

public class Truck extends FreightVehicle {

    public Truck(String licensePlate, int rentalDay, int numberSeats, double PMA) {
        super(licensePlate, rentalDay, numberSeats, PMA);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }

    @Override
    public String toString() {
        return "Truck{} " + super.toString();
    }
}
