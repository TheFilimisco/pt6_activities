package medicalappointmentmanagement.test;

import medicalappointmentmanagement.management.ManagementMedical;
import medicalappointmentmanagement.models.DoctorOffice;
import medicalappointmentmanagement.models.Visit;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMedicalAppointment {
    public static void main(String[] args) {

        ArrayList<Visit> visits = new ArrayList<>();
        ArrayList<DoctorOffice> doctorOffices = new ArrayList<>();
        ManagementMedical managementMedical = new ManagementMedical(visits,doctorOffices);

        Scanner input = new Scanner(System.in);


        boolean running = true;

        while (running){
            int inputNumber = input.nextInt();
            System.out.println("""
                    1.Add to Visit to Doctor Office
                """);
            System.out.print("Enter your option number: ");
            switch (inputNumber) {
                case 1:
                    System.out.println("======Adding visitMedical to Doctor Office======");
                    System.out.println("Enter your speciality: ");
                    String nameDoctorOffice = input.nextLine();
                    managementMedical.visitProgrammedForThisDoctorOffice(nameDoctorOffice);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Do to write correct option!");
                    break;
            }

        }

    }




}
