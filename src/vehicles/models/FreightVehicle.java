package vehicles.models;

public class FreightVehicle extends Vehicle {
    protected double PMA;

    public FreightVehicle(String licensePlate, int rentalDay, int numberSeats, double PMA) {
        super(licensePlate, rentalDay, numberSeats);
        this.PMA = PMA;
    }

    @Override
    public double getPrice() {
        return (10 * rentalDay) + (20 * PMA);
    }

    @Override
    public String toString() {
        return "FreightVehicle{} " + super.toString();
    }
}
