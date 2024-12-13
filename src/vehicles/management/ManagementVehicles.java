package vehicles.management;

import vehicles.models.Car;
import vehicles.models.Vehicle;

import java.util.ArrayList;

public class ManagementVehicles {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ManagementVehicles() {
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle showPriceOfVehicle(String inputYourLicensePlate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(inputYourLicensePlate)) {
                return vehicle;
            }
        }
        return null;
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
