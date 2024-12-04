package ferriesmanagement.models;

public class Truck {
    private String licensePlate;
    private double weight;

    public Truck(String licensePlate, double weight) {
        this.licensePlate = licensePlate;
        this.weight = weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Truck{" +
                "licensePlate='" + licensePlate + '\'' +
                ", weight=" + weight +
                '}';
    }
}
