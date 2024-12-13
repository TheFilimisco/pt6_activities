package floodmonitoringsystem.models;

import java.util.ArrayList;

public class EvacuationZone {
    private String nameZone;
    private int limitCapacity;
    ArrayList<String> evacuatedPeople;

    public EvacuationZone(String nameZone, int limitCapacity, ArrayList<String> evacuatedPeople) {
        this.nameZone = nameZone;
        this.limitCapacity = limitCapacity;
        this.evacuatedPeople = evacuatedPeople;
    }

    public String getNameZone() {
        return nameZone;
    }

    public void setNameZone(String nameZone) {
        this.nameZone = nameZone;
    }

    public int getLimitCapacity() {
        return limitCapacity;
    }

    public void setLimitCapacity(int limitCapacity) {
        this.limitCapacity = limitCapacity;
    }

    public ArrayList<String> getEvacuatedPeople() {
        return evacuatedPeople;
    }

    public void setEvacuatedPeople(ArrayList<String> evacuatedPeople) {
        this.evacuatedPeople = evacuatedPeople;
    }

    @Override
    public String toString() {
        return "EvacuationZone{" +
                "nameZone='" + nameZone + '\'' +
                ", limitCapacity=" + limitCapacity +
                ", evacuatedPeople=" + evacuatedPeople +
                '}';
    }
}