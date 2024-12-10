package medicalappointmentmanagement.test;


import medicalappointmentmanagement.models.DoctorOffice;
import medicalappointmentmanagement.models.Visit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuMedicalAppointment {
    public static void main(String[] args) {

        ArrayList<Visit> visitsGastro = new ArrayList<>();
        visitsGastro.add(new Visit(LocalDateTime.of(2023, 12, 10, 23, 30), "Julio"));
        visitsGastro.add(new Visit(2023,12,11, 12,30, "Steven"));
        visitsGastro.add(new Visit(2023,12,11, 13,30, "Miguel"));
        visitsGastro.add(new Visit(2024,12,11, 13,30, "Oscar"));
        visitsGastro.add(new Visit(2025,12,11, 13,30, "Nino"));

        DoctorOffice doctorOffice = new DoctorOffice("Stephen", "Gastro", visitsGastro );
        Scanner input = new Scanner(System.in);


        boolean running = true;

        while (running){
            System.out.println("""
                   ==============Menu Medical Appointment============
                    1. Add new visit medical (Auto-Verified if this possible)
                    2. Get number of visits programmed
                    3. Get Visited of between of Dates
                    4. Delete Visit with Number Visit
                """);
            System.out.print("Enter your option number: ");
            int inputNumber = input.nextInt();
            switch (inputNumber) {
                case 1:
                    input.nextLine();
                    System.out.println("======Adding visitMedical to Doctor Office======");
                    System.out.print("Enter name's patient: ");
                    String namePatient = input.nextLine();
                    System.out.print("Enter Year of Date(aaaa): ");
                    int inputYearToNewDate = input.nextInt();
                    System.out.print("Enter Month of Date(1-12): ");
                    int inputMonthToNewDate = input.nextInt();
                    System.out.print("Enter day of Date(1-30): ");
                    int inputDayToNewDate = input.nextInt();
                    System.out.print("Enter Hour of Date(24h): ");
                    int inputHourToNewDate = input.nextInt();
                    System.out.print("Enter Hour of Date(60m): ");
                    int inputMinuteToNewDate = input.nextInt();
                    Visit newVisit = new Visit(inputYearToNewDate,inputMonthToNewDate,inputDayToNewDate,inputHourToNewDate,inputMinuteToNewDate,namePatient);
                    if (doctorOffice.isPossibleAddThisVisit(newVisit)){
                        doctorOffice.getVisits().add(newVisit);
                        System.out.println("Successful!");
                        break;
                    }
                    System.out.println("Error time interval is less than 30 minute to Other Date!");
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("======Get visit numbers of Doctor Office======");
                    System.out.println(doctorOffice.getNumberVisitsProgrammed());
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("======Search Visit of Both Dates======");
                    System.out.println("Put the First Date(YYYY-MM-DD HH:mm): ");
                    String inputDateTimeFirst = input.nextLine();
                    LocalDateTime dateFirst = LocalDateTime.parse(inputDateTimeFirst, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Put the First Date(YYYY-MM-DD HH:mm): ");
                    String inputDateTimeSecond = input.nextLine();
                    LocalDateTime dateSecond = LocalDateTime.parse(inputDateTimeSecond, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    doctorOffice.getVisitsProgrammedBetweenBothDate(dateFirst,dateSecond);
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("======Delete a Visit======");
                    System.out.print("Enter the number Visit: ");
                    int inputNumberVisit = input.nextInt();
                    doctorOffice.deleteVisitedForNumberVisit(inputNumberVisit);
                    break;
                case 6:

                    running = false;
                    break;
                case 7:
                    for (Visit visit: doctorOffice.getVisits()){
                        System.out.println(visit);
                    }
                    break;
                default:
                    System.out.println("Do to write correct option!");
                    break;
            }

        }

    }




}
