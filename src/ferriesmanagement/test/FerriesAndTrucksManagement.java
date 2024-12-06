package ferriesmanagement.test;

import ferriesmanagement.models.Ferry;
import ferriesmanagement.models.Truck;

import java.util.ArrayList;

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
        System.out.println(ferry);

        FerriesAndTrucksManagement management = new FerriesAndTrucksManagement();

        //Works!
//        var petition1 = management.totalWeightOfTrucksEmbark(ferry);

        String petition1 = management.formatTextWeight(management.totalWeightOfTrucksEmbark(ferry));
        System.out.println(petition1);

        //Works!
        String petition2 = management.itsTruckEmbark("XXXX", ferry);
        System.out.println(petition2);

        //Works!
        String petition3 = management.itsTruckEmbark("XXXX234", ferry);
        System.out.println(petition3);


        // High of Weight!
        Truck truck3 = new Truck("XXX5",60);
        String petition4 = management.itsPossibleTruckEmbark(truck3,ferry);
        System.out.println(petition4);

        //Low of Weight!
        Truck truck4 = new Truck("XXX6",20);
        String petition5 = management.itsPossibleTruckEmbark(truck4,ferry);
        System.out.println(petition5);

        //Show Trucks List of ferry before the method
        System.out.println(ferry.getTrucks());

        //Show Truc List After of method
        management.embarkThisTruck(truck4,ferry);
        System.out.println(ferry.getTrucks());


        //Position correct
        String petition6 = management.getTruckEmbarkPosition(0,ferry);
        System.out.println(petition6);

        //Position Incorrect
        String petition7 = management.getTruckEmbarkPosition(6,ferry);
        System.out.println(petition7);


        // Works!
        String petition8 = management.getPriceForTruckEmbarked(truck4,ferry);
        System.out.println(petition8);


        // Works!
        String petition9 = management.formatTextPrice(management.getPriceTotalTrucksEmbarked(ferry));
        System.out.println(petition9);

    }

    private String formatTextWeight(double weight) {
        return weight + " " + ".t";
    }

    private String formatTextPrice(double price) {
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
         ferry.getTrucks().add(truck);
        System.out.println("Process Sucessfull!");
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
//        double priceTruck = 0;
//        for (Truck tru: ferry.getTrucks()) {
//            priceTruck=tru.getWeight()*ferry.getFerryPriceByWeight();
//        }
//        return  priceTruck + ".€";
        return truck.getWeight()*ferry.getFerryPriceByWeight() + ".€";
    }

    public double getPriceTotalTrucksEmbarked(Ferry ferry) {
        return  totalWeightOfTrucksEmbark(ferry) * ferry.getFerryPriceByWeight();
    }

}
