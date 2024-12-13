package floodmonitoringsystem.models;

import java.util.ArrayList;

public class EmergencyTeam {
    private String nameEmergencyTeam;
    private String typeOfEmergencyTeam;
    private ArrayList<String> listOfMembers;

    public EmergencyTeam(String nameEmergencyTeam, String typeOfEmergencyTeam) {
        this.nameEmergencyTeam = nameEmergencyTeam;
        if (typeOfEmergencyTeam.equals("rescue")) {
            this.typeOfEmergencyTeam = typeOfEmergencyTeam;
            this.listOfMembers = new ArrayList<String>();
            listOfMembers.add("helicopterDriver");
            listOfMembers.add("RescueBoss");
            listOfMembers.add("RescueDog");

        } else if (typeOfEmergencyTeam.equals("assistance")) {
            this.typeOfEmergencyTeam = typeOfEmergencyTeam;
            this.listOfMembers = new ArrayList<String>();
            listOfMembers.add("nurse");
            listOfMembers.add("FirstAid");
            listOfMembers.add("Doctor");
        }
    }

    public String getNameEmergencyTeam() {
        return nameEmergencyTeam;
    }

    public void setNameEmergencyTeam(String nameEmergencyTeam) {
        this.nameEmergencyTeam = nameEmergencyTeam;
    }

    public String getTypeOfEmergencyTeam() {
        return typeOfEmergencyTeam;
    }

    public void setTypeOfEmergencyTeam(String typeOfEmergencyTeam) {
        this.typeOfEmergencyTeam = typeOfEmergencyTeam;
    }

    public ArrayList<String> getListOfMembers() {
        return listOfMembers;
    }

    public void setListOfMembers(ArrayList<String> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }

    @Override
    public String toString() {
        return "EmergencyTeam{" +
                "nameEmergencyTeam='" + nameEmergencyTeam + '\'' +
                ", typeOfEmergencyTeam='" + typeOfEmergencyTeam + '\'' +
                ", listOfMembers=" + listOfMembers +
                '}';
    }
}
