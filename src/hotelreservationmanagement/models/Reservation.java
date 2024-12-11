package hotelreservationmanagement.models;

import java.time.LocalDate;

public class Reservation {
    private String nameClient;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Room room;

    public Reservation(String nameClient, LocalDate checkInDate, LocalDate checkOutDate, Room room) {
        this.nameClient = nameClient;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "nameClient='" + nameClient + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", room=" + room +
                '}';
    }
}
