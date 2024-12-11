package hotelreservationmanagement.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;


    public Hotel(ArrayList<Room> rooms, ArrayList<Reservation> reservations) {
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public Hotel() {
        this.rooms = new ArrayList<>();
        rooms.add(new Room("simple"));
        rooms.add(new Room("simple"));
        rooms.add(new Room("simple"));

        rooms.add(new Room("double"));
        rooms.add(new Room("double"));

        rooms.add(new Room("suite"));
        this.reservations = new ArrayList<>();
    }

    public Hotel(Room room){
        rooms = new ArrayList<>();
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void searchThisRoom(String typeOfRoomYouWant, String nameClient, LocalDate checkInDate, LocalDate checkOutDate){
        for (Room room: rooms){
            if (typeOfRoomYouWant.equals(room.getTypeOfRoom()) && (!room.isThisReserved())) {
                room.setThisReserved(true);
                reservations.add(new Reservation(nameClient,checkInDate,checkOutDate,room));
                return;
            }
        }
    }

    public void searchRoomsAvailableForDate(LocalDate checkInDate, LocalDate checkOutDate){
        for (Room room: rooms) {
            if (!room.isThisReserved()) {
                System.out.println(room);
            }
        }
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", reservations=" + reservations +
                '}';
    }
}
