package floodmonitoringsystem.management;

import floodmonitoringsystem.models.EmergencyTeam;
import floodmonitoringsystem.models.EvacuationZone;
import floodmonitoringsystem.models.Flood;

import java.util.ArrayList;

public class ManagementFlood {
    private ArrayList<Flood> floods;
    private ArrayList<EvacuationZone> evacuationZones;
    private ArrayList<EmergencyTeam> emergencyTeams;

    public ManagementFlood(ArrayList<Flood> floods, ArrayList<EvacuationZone> evacuationZones, ArrayList<EmergencyTeam> emergencyTeams) {
        this.floods = floods;
        this.evacuationZones = evacuationZones;
        this.emergencyTeams = emergencyTeams;
    }

    public ArrayList<Flood> getFloods() {
        return floods;
    }

    public void setFloods(ArrayList<Flood> floods) {
        this.floods = floods;
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

    public ArrayList<EvacuationZone> giveAlertsInEvacuationZone(double inputMinWaterDeep) {
        ArrayList<EvacuationZone> evacuationZonesAlerts = new ArrayList<>();
        for (Flood flood : floods) {
            if ((flood.getWaterDeep() < inputMinWaterDeep)) {
                evacuationZonesAlerts.addAll(flood.getEvacuationZones());
            }
        }
        return evacuationZonesAlerts;
    }

    public ArrayList<EvacuationZone> showEvacuationZonesFlood(double inputMaxWaterDeep) {
        ArrayList<EvacuationZone> evacuationZonesFlood = new ArrayList<>();
        for (Flood flood : floods) {
            if (flood.getWaterDeep() < inputMaxWaterDeep) {
                evacuationZonesFlood.addAll(flood.getEvacuationZones());
            }
        }
        return evacuationZonesFlood;
    }


    public void showTeamEmergencySendZones(double inputMaxWaterDeep) {
        for (EmergencyTeam emergencyTeam : emergencyTeams) {
            for (EvacuationZone evacuationZone : showEvacuationZonesFlood(inputMaxWaterDeep)) {
                System.out.println("Send " + emergencyTeam.getListOfMembers() + " for: " + evacuationZone);
            }
        }
    }


    @Override
    public String toString() {
        return "ManagementFlood{" +
                "floods=" + floods +
                ", evacuationZones=" + evacuationZones +
                ", emergencyTeams=" + emergencyTeams +
                '}';
    }
}
