package hotelreservationmanagement.test;

import hotelreservationmanagement.models.Hotel;
import hotelreservationmanagement.models.Reservation;
import hotelreservationmanagement.models.Room;
import hotelreservationmanagement.models.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
                2. Get valuables rooms
                5. Close
                """);
            System.out.print("Enter your number: ");
            var numberInput = input.nextInt();
            switch (numberInput){
                case 1:
                    input.nextLine();
                    System.out.println("===========Add Reservation========");

                    System.out.print("Whats your name: ");
                    String inputYourName = input.nextLine();

                    System.out.print("What kind of room you wish: " );
                    String inputKindOfRoom = input.nextLine();

                    System.out.println("Put the Check-in-date(YYYY-MM-DD): ");
                    String inputDateTimeFirst = input.nextLine();
                    LocalDate dateFirst = LocalDate.parse(inputDateTimeFirst, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    System.out.println("Put the Check-out-date(YYYY-MM-DD): ");
                    String inputDateTimeSecond = input.nextLine();
                    LocalDate dateSecond = LocalDate.parse(inputDateTimeSecond, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    hotel.addNewReservation(inputKindOfRoom,inputYourName,dateFirst,dateSecond);
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
                    hotel.searchRoomsAvailableForDate(firstDate,secondDate);
                    break;
                case 5:
                    System.out.println("Leave...");
                    running = false;
                    break;
                default:
                    System.out.println("Do write a option correct, please!");
            }
        }



    }





}
