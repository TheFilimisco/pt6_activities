package ferriesmanagement.test;

import ferriesmanagement.models.Ferry;
import ferriesmanagement.models.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class FerriesAndTrucksManagement {

    public FerriesAndTrucksManagement() {

    }

    public static void main(String[] args) {
        ArrayList<Truck> trucks = new ArrayList<>();

        Truck truck = new Truck("XXXX",23);
        Truck truck1 = new Truck("XXX1",20);
        Truck truck2 = new Truck("XXX2",15);
        trucks.add(truck);
        trucks.add(truck1);
        trucks.add(truck2);

        Ferry ferry = new Ferry("XXX","LA PINTA", "Barcelona",20.0, 100, trucks );
        ArrayList<Ferry> ferries = new ArrayList<>();
        ferries.add(ferry);
        FerriesAndTrucksManagement management = new FerriesAndTrucksManagement();



        //Works!
//        var petition1 = management.totalWeightOfTrucksEmbark(ferry);
//        String petition1 = management.formatTextWeight(management.totalWeightOfTrucksEmbark(ferry));
//        System.out.println(petition1);
//
//        //Works!
//        String petition2 = management.itsTruckEmbark("XXXX", ferry);
//        System.out.println(petition2);
//
//        //Works!
//        String petition3 = management.itsTruckEmbark("XXXX234", ferry);
//        System.out.println(petition3);
//
//
//        // High of Weight!
//        Truck truck3 = new Truck("XXX5",60);
//        String petition4 = management.itsPossibleTruckEmbark(truck3,ferry);
//        System.out.println(petition4);
//
//        //Low of Weight!
//        Truck truck4 = new Truck("XXX6",20);
//        String petition5 = management.itsPossibleTruckEmbark(truck4,ferry);
//        System.out.println(petition5);
//
//        //Show Trucks List of ferry before the method
//        System.out.println(ferry.getTrucks());
//
//        //Show Truc List After of method
//        management.embarkThisTruck(truck4,ferry);
//        System.out.println(ferry.getTrucks());
//
//
//        //Position correct
//        String petition6 = management.getTruckEmbarkPosition(0,ferry);
//        System.out.println(petition6);
//
//        //Position Incorrect
//        String petition7 = management.getTruckEmbarkPosition(6,ferry);
//        System.out.println(petition7);
//
//
//        // Works!
//        String petition8 = management.getPriceForTruckEmbarked(truck4,ferry);
//        System.out.println(petition8);
//
//
//        // Works!
//        String petition9 = management.formatTextPrice(management.getPriceTotalTrucksEmbarked(ferry));
//        System.out.println(petition9);

        Scanner input = new Scanner(System.in);

        var runing = true;

        while (runing) {
            System.out.println("""
                    =====================Menu Ferries and Trucks===============
                    1. Get the weight total of Trucks on Embarked to Ferry
                    2. Search if your Truck is Embarked at the Ferry
                    3. Could embarked a Truck at the Ferry
                    4. Embarked this Truck
                    5. Search Truck For Position
                    6. Get Pay Toll of a Truck
                    7. Get recollected total pay toll of a Ferry
                    ===========================================================
                    """);
            System.out.print("Enter your number: ");
            var inputNumber = input.nextInt();
            switch (inputNumber){
                case 1:
                    input.nextLine();
                    System.out.println("=======Total Weight of Trucks Embarked=====");
                    System.out.print("Put your license Plate of Ferry: ");
                    try {
                        var inputLicensePlateFerry = input.nextLine();
                        System.out.println((management.formatTextWeight(management.totalWeightOfTrucksEmbark(searchFerryForLicensePlate(inputLicensePlateFerry,ferries)))));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("=======Search Truck at the Ferry=====");
                    System.out.print("Put your license Plate of Ferry: ");
                    var inputLicensePlateFerry = input.nextLine();
                    System.out.print("Put your license Plate of Truck: ");
                    var inputLicensePlateTruck = input.nextLine();
                    try {
                        System.out.println(management.itsTruckEmbark(inputLicensePlateTruck,searchFerryForLicensePlate(inputLicensePlateFerry,ferries)));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    input.nextLine();
                    System.out.println("=======Is it possible embarked this Truck?=====");
                    System.out.print("Put your license Plate of Ferry: ");
                    var inputLicensePlateFerryPossible = input.nextLine();
                    System.out.print("Put your license Plate of Truck: ");
                    var inputLicensePlateTruckPossible = input.nextLine();
                    try {
                        System.out.println(management.itsPossibleTruckEmbark(searchTruckForLicensePlate(inputLicensePlateTruckPossible,trucks),searchFerryForLicensePlate(inputLicensePlateFerryPossible,ferries)));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    input.nextLine();
                    System.out.println("=======Embarked this Truck=====");
                    System.out.print("Put your license Plate of Ferry selected to embarked your Truck: ");
                    var licensePlateOfFerry = input.nextLine();
                    System.out.print("Put new license Plate of Truck: ");
                    var newLicensePlateTruck = input.nextLine();
                    System.out.print("Put new Weight for Truck: ");
                    var newWeightForThisTruck = input.nextInt();
                    try {
                        management.embarkThisTruck(new Truck(newLicensePlateTruck,newWeightForThisTruck),searchFerryForLicensePlate(licensePlateOfFerry,ferries));
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("==========Search Truck For Position========");
                    System.out.print("Put your position number: ");
                    var positionNumberOfTruck = input.nextInt();
                    System.out.print("Put your license Plate of Ferry where this truck: ");
                    var ferryWhereFoundTrack = input.nextLine();
                    try {
                        System.out.println( management.getTruckEmbarkPosition(positionNumberOfTruck,searchFerryForLicensePlate(ferryWhereFoundTrack,ferries)));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    input.nextLine();
                    System.out.println("==========Get Pay Toll of a Truck========");
                    System.out.print("Put your license Plate of Ferry: ");
                    var inputLicensePlateOfFerry = input.nextLine();
                    System.out.print("Put your license Plate of Truck: ");
                    var inputLicensePlateOfTruck = input.nextLine();
                    try {
                        System.out.println(management.getPriceForTruckEmbarked(searchTruckForLicensePlate(inputLicensePlateOfTruck,trucks), searchFerryForLicensePlate(inputLicensePlateOfFerry,ferries)));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 7:
                    input.nextLine();
                    System.out.println("==========Get Total Pay Toll of a Ferry========");
                    System.out.print("Put your license Plate of Ferry: ");
                    var ferryLicensePlateForTotalPayToll = input.nextLine();
                    try {
                        System.out.println(management.getPriceTotalTrucksEmbarked(searchFerryForLicensePlate(ferryLicensePlateForTotalPayToll,ferries)));
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Leaving...");
                    runing = false;
                    break;
                default:
                    System.out.println("Do write right value!...");
            }
        }


    }

    private static Ferry searchFerryForLicensePlate(String inputLicensePlateFerry, ArrayList<Ferry> ferries){
        for (Ferry ferry: ferries) {
            if (ferry.getLicensePlate().equals(inputLicensePlateFerry)){
                return ferry;

            }
        } throw new IllegalArgumentException("The License plate of Ferry: " + inputLicensePlateFerry + " doesn't exist!");
    }

    private static Truck searchTruckForLicensePlate(String inputLicensePlateTruck, ArrayList<Truck> trucks){
        for (Truck truck: trucks) {
            if (truck.getLicensePlate().equals(inputLicensePlateTruck)){
                return truck;
            }
        } throw new IllegalArgumentException("The License plate of Truck: " + inputLicensePlateTruck + " doesn't exist!");
    }



    private String formatTextWeight(double weight) {
        return weight + " " + ".t";
    }

    private  String formatTextPrice(double price) {
        return price + " " + ".€";
    }


    public double totalWeightOfTrucksEmbark(Ferry ferry){
        double totalWeight = 0;
        for (Truck truck: ferry.getTrucks()){
            totalWeight+= truck.getWeight();
        }
        return totalWeight;
    }

    public String itsTruckEmbark(String licensePlate, Ferry ferry){
        for (Truck truck: ferry.getTrucks()){
            if (licensePlate.equals(truck.getLicensePlate())){
                return "Found!" + truck;
//                return "Found!" + truck.getLicensePlate();
            }
        }
        return "Doesn't Found...";
    }

    public String itsPossibleTruckEmbark(Truck truck, Ferry ferry){
        double totalWeight = 0;
        for (Truck tru: ferry.getTrucks()) {
            totalWeight+=tru.getWeight();
        }
        if (totalWeight+truck.getWeight()>ferry.getMaxWeightToTransport()) {
            return "Dont possible for: " + (totalWeight+truck.getWeight() - ferry.getMaxWeightToTransport()) + "t";
        }
        return "Its possible!";
    }

    public void embarkThisTruck(Truck truck, Ferry ferry){
        if (itsPossibleTruckEmbark(truck, ferry).equals("Its possible!")) {
            ferry.getTrucks().add(truck);
            System.out.println("Process Sucessfull!");
        } else {
            System.out.println(itsPossibleTruckEmbark(truck,ferry));
        }
    }


    public String getTruckEmbarkPosition(int Position, Ferry ferry){
        for (int i = 0; i < ferry.getTrucks().size(); i++) {
            if (Position==i){
                return "Position: " + i +" "+  ((ferry.getTrucks().get(i)));
            }
        }
        return "The position is wrong. Please to write a correct position...";
    }

    public String getPriceForTruckEmbarked(Truck truck, Ferry ferry){
        return truck.getWeight()*ferry.getFerryPriceByWeight() + ".€";
    }

    public double getPriceTotalTrucksEmbarked(Ferry ferry) {
        return  totalWeightOfTrucksEmbark(ferry) * ferry.getFerryPriceByWeight();
    }

}
