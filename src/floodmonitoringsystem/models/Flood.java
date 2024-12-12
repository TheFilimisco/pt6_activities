package floodmonitoringsystem.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Flood {
    private double waterDeep;
    private LocalDate floodDate;
    ArrayList<EvacuationZone> evacuationZones;
    ArrayList<EmergencyTeam> emergencyTeams;

    public Flood(double waterDeep, LocalDate floodDate, ArrayList<EvacuationZone> evacuationZones, ArrayList<EmergencyTeam> emergencyTeams) {
        this.waterDeep = waterDeep;
        this.floodDate = floodDate;
        this.evacuationZones = evacuationZones;
        this.emergencyTeams = emergencyTeams;
    }

    public double getWaterDeep() {
        return waterDeep;
    }

    public void setWaterDeep(double waterDeep) {
        this.waterDeep = waterDeep;
    }

    public LocalDate getFloodDate() {
        return floodDate;
    }

    public void setFloodDate(LocalDate floodDate) {
        this.floodDate = floodDate;
    }

    public ArrayList<EvacuationZone> getEvacuationZones() {
        return evacuationZones;
    }

    public void setEvacuationZones(ArrayList<EvacuationZone> evacuationZones) {
        this.evacuationZones = evacuationZones;
    }

    public ArrayList<EmergencyTeam> getEmergencyTeams() {
        return emergencyTeams;
    }

    public void setEmergencyTeams(ArrayList<EmergencyTeam> emergencyTeams) {
        this.emergencyTeams = emergencyTeams;
    }

    @Override
    public String toString() {
        return "Flood{" +
                "waterDeep=" + waterDeep +
                ", floodDate=" + floodDate +
                ", evacuationZones=" + evacuationZones +
                ", emergencyTeams=" + emergencyTeams +
                '}';
    }
}
