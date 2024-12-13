package vehicles.models;

public abstract class Vehicle {
    protected String licensePlate;
    protected int rentalDay;
    protected int numberSeats;

    public Vehicle(String licensePlate, int rentalDay, int numberSeats) {
        this.licensePlate = licensePlate;
        this.rentalDay = rentalDay;
        this.numberSeats = numberSeats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", rentalDay=" + rentalDay +
                ", numberSeats=" + numberSeats +
                '}';
    }

    
}
