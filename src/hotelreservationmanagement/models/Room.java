package hotelreservationmanagement.models;

import java.util.ArrayList;

public class Room {
    private int numberRoom;
    private String typeOfRoom;
    private ArrayList<Service> services;
    private static int counterRoom = 0;

    public Room() {
        this.services= new ArrayList<Service>();
    }

    public Room(String typeOfRoom, Service service) {
        this.typeOfRoom = typeOfRoom;
        services = new ArrayList<>();
        services.add(service);
    }

    public Room(String typeOfRoom, ArrayList<Service> services) {
        this.typeOfRoom = typeOfRoom;
        this.services = services;
    }

    public Room(String typeOfRoom) {
        this.numberRoom = counterRoom++;
        switch (typeOfRoom) {
            case "simple" -> {
                this.typeOfRoom = typeOfRoom;
                services = new ArrayList<>();
                services.add(new Service("wifi"));
                services.add(new Service("a/c"));
            }
            case "double" -> {
                this.typeOfRoom = typeOfRoom;
                services = new ArrayList<>();
                services.add(new Service("wifi"));
                services.add(new Service("a/c"));
                services.add(new Service("minibar"));
            }
            case "suite" -> {
                this.typeOfRoom = typeOfRoom;
                services = new ArrayList<>();
                services.add(new Service("wifi"));
                services.add(new Service("a/c"));
                services.add(new Service("minibar"));
                services.add(new Service("buffet"));
            }
        }
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberRoom=" + numberRoom +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", services=" + services +
                '}';
    }
}
