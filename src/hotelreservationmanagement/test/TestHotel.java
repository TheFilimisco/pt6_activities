package hotelreservationmanagement.test;

import hotelreservationmanagement.models.Hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestHotel {

    public static void main(String[] args) {


        Hotel hotel = new Hotel();
        Scanner input = new Scanner(System.in);
        var running = true;

        while (running) {
            System.out.println("""
                    ==================Menu Hotel==============
                    1. Add to reservation to Hotel
                    2. Get Available rooms
                    3. Get services a room
                    4. Show Rooms a Hotel with Reservations
                    5. Its available this room?
                    6. Close
                    ==========================================
                    """);
            System.out.print("Enter your number: ");
            var numberInput = input.nextInt();
            switch (numberInput) {
                case 1:
                    input.nextLine();
                    System.out.println("===========Add Reservation========");

                    System.out.print("Enter your name: ");
                    String inputYourName = input.nextLine();

                    System.out.print("What kind of room you wish: ");
                    String inputKindOfRoom = input.nextLine();

                    System.out.println("Put the Check-in-date(YYYY-MM-DD): ");
                    String inputDateTimeFirst = input.nextLine();
                    LocalDate dateFirst = LocalDate.parse(inputDateTimeFirst, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    System.out.println("Put the Check-out-date(YYYY-MM-DD): ");
                    String inputDateTimeSecond = input.nextLine();
                    LocalDate dateSecond = LocalDate.parse(inputDateTimeSecond, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    hotel.addNewReservation(inputKindOfRoom, inputYourName, dateFirst, dateSecond);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("=================Search Available Rooms=========");
                    System.out.println("Put the Check-in-date(YYYY-MM-DD): ");
                    String searchFirstDate = input.nextLine();
                    LocalDate firstDate = LocalDate.parse(searchFirstDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    System.out.println("Put the Check-out-date(YYYY-MM-DD): ");
                    String searchSecondtDate = input.nextLine();
                    LocalDate secondDate = LocalDate.parse(searchSecondtDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    hotel.searchRoomsAvailableForDate(firstDate, secondDate);
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("=================Show Services of a Room=========");
                    System.out.println("Enter your room number: ");
                    int inputNumberRoom = input.nextInt();
                    hotel.getServicesOfRoom(inputNumberRoom);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("=================Rooms of your Hotel=========");
                    hotel.showTotalRooms();
                    System.out.println("=================Reservations of your Hotel=========");
                    hotel.showTotalReservations();
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("============Its available this room?==============");
                    System.out.print("Enter your room number: ");
                    int inputSearchRoom = input.nextInt();
                    input.nextLine();
                    System.out.println("Put the Date (YYYY-MM-DD): ");
                    String inputSpecificDate = input.nextLine();

                    LocalDate specificDate = LocalDate.parse(inputSpecificDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    hotel.itsRoomAvailableForDate(inputSearchRoom, specificDate);
                    break;
                case 6:
                    System.out.println("Leave...");
                    running = false;
                    break;
                default:
                    System.out.println("Do write a option correct, please!");
            }
        }


    }


}
