package ferriesmanagement.models;

import java.util.ArrayList;

public class Ferry {
    private String licensePlate;
    private String name;
    private String namePortDestination;
    private double ferryPriceByWeight;
    private double maxWeightToTransport;
    private ArrayList<Truck> trucks;

    public Ferry(String licensePlate, String name, String namePortDestination, double ferryPriceByWeight, double maxWeightToTransport, ArrayList<Truck> trucks) {
        this.licensePlate = licensePlate;
        this.name = name;
        this.namePortDestination = namePortDestination;
        this.ferryPriceByWeight = ferryPriceByWeight;
        this.maxWeightToTransport = maxWeightToTransport;
        this.trucks = trucks;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePortDestination() {
        return namePortDestination;
    }

    public void setNamePortDestination(String namePortDestination) {
        this.namePortDestination = namePortDestination;
    }

    public double getFerryPriceByWeight() {
        return ferryPriceByWeight;
    }

    public void setFerryPriceByWeight(double ferryPriceByWeight) {
        this.ferryPriceByWeight = ferryPriceByWeight;
    }

    public double getMaxWeightToTransport() {
        return maxWeightToTransport;
    }

    public void setMaxWeightToTransport(double maxWeightToTransport) {
        this.maxWeightToTransport = maxWeightToTransport;
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(ArrayList<Truck> trucks) {
        this.trucks = trucks;
    }

    @Override
    public String toString() {
        return "Ferry{" +
                "licensePlate='" + licensePlate + '\'' +
                ", name='" + name + '\'' +
                ", namePortDestination='" + namePortDestination + '\'' +
                ", ferryPriceByWeight=" + ferryPriceByWeight +
                ", maxWeightToTransport=" + maxWeightToTransport +
                ", trucks=" + trucks +
                '}';
    }
}
