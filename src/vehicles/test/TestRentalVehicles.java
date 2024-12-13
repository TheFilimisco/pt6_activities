package vehicles.test;

import vehicles.management.ManagementVehicles;
import vehicles.models.Car;
import vehicles.models.FreightVehicle;
import vehicles.models.Minibus;
import vehicles.models.Truck;

import java.util.Scanner;

public class TestRentalVehicles {

    public static void main(String[] args) {

        ManagementVehicles managementVehicles = new ManagementVehicles();
        managementVehicles.addNewVehicle(new Car("XXX", 10, 4));
        managementVehicles.addNewVehicle(new Minibus("XXX", 10, 30));
        managementVehicles.addNewVehicle(new Truck("XXX", 10, 2, 20));
        managementVehicles.addNewVehicle(new FreightVehicle("XXX", 10, 2, 40));

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("""
                    ==================Menu Rental Car==============
                    1. Add new Vehicle(Car,Truck,Minibus,FreightVehicle)
                    2. Show a vehicle Price
                    3. Show All vehicles
                    4. Leave...
                    """);
            System.out.print("Enter your number: ");
            var inputNumber = input.nextInt();
            switch (inputNumber) {
                case 1:
                    input.nextLine();
                    System.out.println("=========Add new Vehicle========");
                    System.out.print("Enter your type of vehicle: ");
                    String inputYourTypeOfVehicle = input.nextLine();
                    switch (inputYourTypeOfVehicle) {
                        case "Car", "Minibus":
                            System.out.println("=========Car or Minibus===========");
                            System.out.print("Enter new license Plate: ");
                            String inputLicensePlate = input.nextLine();
                            System.out.print("Enter new rental Days: ");
                            int inputRentalDay = input.nextInt();
                            System.out.print("Enter new number seats: ");
                            int inputNumberSeats = input.nextInt();
                            if (inputYourTypeOfVehicle.equals("Car")) {
                                managementVehicles.addNewVehicle(new Car(inputLicensePlate, inputRentalDay, inputNumberSeats));
                            } else {
                                managementVehicles.addNewVehicle(new Minibus(inputLicensePlate, inputRentalDay, inputNumberSeats));
                            }
                            break;
                        case "FreightVehicle", "Truck":
                            System.out.println("=========FreightVehicle or Truck===========");
                            System.out.print("Enter new license Plate: ");
                            String inputNewLicensePlate = input.nextLine();
                            System.out.print("Enter new rental Days: ");
                            int inputNewRentalDay = input.nextInt();
                            System.out.println("Enter your PMA: ");
                            double inputNewPMA = input.nextInt();
                            if (inputYourTypeOfVehicle.equals("FreightVehicle")) {
                                managementVehicles.addNewVehicle(new FreightVehicle(inputNewLicensePlate, inputNewRentalDay, 2, inputNewPMA));
                            } else {
                                managementVehicles.addNewVehicle(new Truck(inputNewLicensePlate, inputNewRentalDay, 2, inputNewPMA));
                            }
                            break;
                        default:
                            System.out.println("Please write a exist Type!");
                            break;
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("============Show a vehicle=======");
                    System.out.print("Enter your LicensePlate");
                    String inputYourLicensePlate = input.nextLine();
                    System.out.println("The price " + inputYourLicensePlate + " is: " + managementVehicles.showPriceOfVehicle(inputYourLicensePlate));
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("=========Show All Vehicles=======");
                    managementVehicles.showAllVehicles();
                    break;
                case 4:
                    System.out.println("Leave....");
                    running = false;
                    break;
                default:
                    System.out.println("Enter a valid number,pls");
                    break;
            }
        }

    }
}
