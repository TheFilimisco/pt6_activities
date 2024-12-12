package earthquakedatamanagement.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Earthquake {
    private Location location;
    private double magnitude;
    private LocalDate date;
    private ArrayList<Victim> victims;

    public Earthquake(Location location, double magnitude, LocalDate date, ArrayList<Victim> victims) {
        this.location = location;
        this.magnitude = magnitude;
        this.date = date;
        this.victims = victims;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public void setVictims(ArrayList<Victim> victims) {
        this.victims = victims;
    }


    @Override
    public String toString() {
        return "Earthquake{" +
                "location=" + location +
                ", magnitude=" + magnitude +
                ", date=" + date +
                ", victims=" + victims +
                '}';
    }
}
