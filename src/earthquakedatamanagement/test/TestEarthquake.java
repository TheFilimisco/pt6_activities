package earthquakedatamanagement.test;

import earthquakedatamanagement.management.ManagementEarthquake;
import earthquakedatamanagement.models.Earthquake;
import earthquakedatamanagement.models.Location;
import earthquakedatamanagement.models.Victim;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEarthquake {

    public static void main(String[] args) {


        ManagementEarthquake managementEarthquake = new ManagementEarthquake();

        Scanner input = new Scanner(System.in);
        var running = true;

        ArrayList<Victim> victimsBarcelona = new ArrayList<>();
        victimsBarcelona.add(new Victim("Steven", 12, "death"));
        victimsBarcelona.add(new Victim("Julio", 32, "missing"));
        victimsBarcelona.add(new Victim("Mateo", 22, "missing"));
        victimsBarcelona.add(new Victim("Luis", 12, "injured"));
        victimsBarcelona.add(new Victim("Atom", 42, "injured"));

        ArrayList<Victim> victimsMadrid = new ArrayList<>();

        victimsMadrid.add(new Victim("Steven", 12, "death"));
        victimsMadrid.add(new Victim("Julio", 32, "death"));
        victimsMadrid.add(new Victim("Mateo", 22, "death"));


        Location locationMadrid = new Location(40.38, -3.17, "Madrid");
        Location locationBarcelona = new Location(41.38, 2.17, "Barcelona");


        Earthquake earthquakeBarcelona = new Earthquake(locationBarcelona, 7.2, LocalDate.of(2023, 12, 1), victimsBarcelona);
        Earthquake earthquakeMadrid = new Earthquake(locationMadrid, 7.2, LocalDate.of(2023, 12, 2), victimsMadrid);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();

        earthquakes.add(earthquakeBarcelona);
        earthquakes.add(earthquakeMadrid);


        while (running) {
            System.out.println("""
                    =================Menu Earthquake============
                    1. Add earthquakes with victims
                    2. Search victim a specific Earthquake
                    3. Show magnitude and location of Earthquake
                    4. Show Earthquakes this management
                    5. Close
                    """);
            System.out.print("Enter your number: ");
            var inputNumber = input.nextInt();
            switch (inputNumber) {
                case 1:
                    input.nextLine();
                    System.out.println("===========Add Earthquakes with victims=======");
                    System.out.println("Enter city of Earthquake: ");
                    var inputCityEarthquake = input.nextLine();
                    try {
                        if (managementEarthquake.getEarthquakes().add(searchEarthquake(inputCityEarthquake, earthquakes))) {
                            System.out.println("successful!...");
                        } else {
                            System.out.println("Doesn't exist!");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    input.nextLine();
                    System.out.println("===========Add Earthquakes with victims=======");
                    System.out.println("Enter city of Earthquake: ");
                    var inputCityForVictims = input.nextLine();
                    try {
                        managementEarthquake.getVictimsOfEarthquake(searchEarthquake(inputCityForVictims, earthquakes));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("=============== Show magnitude and location of Earthquake==========");
                    System.out.println("Enter city of Earthquake: ");
                    var cityThatShowLocationMagnitude = input.nextLine();
                    try {
                        managementEarthquake.getMagnitudeAndLocationOfEarthquake(searchEarthquake(cityThatShowLocationMagnitude, earthquakes));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("============Show All Earthquake============");
                    for (Earthquake earthquake : managementEarthquake.getEarthquakes()) {
                        System.out.println(earthquake);
                    }
                    break;
                case 5:
                    System.out.println("Leave....");
                    running = false;
                    break;
            }
        }


    }

    public static Earthquake searchEarthquake(String inputNameCity, ArrayList<Earthquake> earthquakes) {
        for (Earthquake earthquake : earthquakes) {
            if (inputNameCity.equals(earthquake.getLocation().getCity())) {
                return earthquake;
            }
        }
        throw new IllegalArgumentException("The Earthquake of city: " + inputNameCity + " doesn't exist!");
    }


}
