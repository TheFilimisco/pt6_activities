package earthquakedatamanagement.management;

import earthquakedatamanagement.models.Earthquake;
import earthquakedatamanagement.models.Location;
import earthquakedatamanagement.models.Victim;

import java.time.LocalDate;
import java.util.ArrayList;

public class ManagementEarthquake {
    private ArrayList<Earthquake> earthquakes;

    public ManagementEarthquake() {
        this.earthquakes = new ArrayList<>();
    }

    public ArrayList<Earthquake> getEarthquakes() {
        return earthquakes;
    }

    public void setEarthquakes(ArrayList<Earthquake> earthquakes) {
        this.earthquakes = earthquakes;
    }

    //addDate
    public void getVictimsOfEarthquake(Earthquake earthquake) {
        for (Earthquake earthquakeIterator : earthquakes) {
            if (earthquake.equals(earthquakeIterator)) {
                for (Victim victim : earthquake.getVictims()) {
                    System.out.println(victim);
                }
            }
        }
    }
    
    public void getMagnitudeAndLocationOfEarthquake(Earthquake earthquake) {
        for (Earthquake earthquakeIterator : earthquakes) {
            if (earthquake.equals(earthquakeIterator)) {
                System.out.println("The city: " + earthquakeIterator.getLocation().getCity() + " Location: " + earthquakeIterator.getLocation() + " magnitude: " + earthquakeIterator.getMagnitude());
            }
        }
    }

    @Override
    public String toString() {
        return "ManagementEarthquake{" +
                "earthquakes=" + earthquakes +
                '}';
    }


}
