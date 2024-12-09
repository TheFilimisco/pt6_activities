package medicalappointmentmanagement.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DoctorOffice {
    private String nameDoctor;
    private String medicalSpecialty;
    private ArrayList<Visit> visits;

    public DoctorOffice() {
        this.visits = new ArrayList<>();
    }

    public DoctorOffice(String nameDoctor, String medicalSpecialty, Visit visit) {
        this.nameDoctor = nameDoctor;
        this.medicalSpecialty = medicalSpecialty;
        visits = new ArrayList<>();
        visits.add(visit);
    }

    public DoctorOffice(String nameDoctor, String medicalSpecialty, ArrayList<Visit> visits) {
        this.nameDoctor = nameDoctor;
        this.medicalSpecialty = medicalSpecialty;
        this.visits = visits;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(String medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }

    public void verifiedDateMedicalToAdd(){

    }

    public void addVisit(int year, int month, int day, int hour, int minutes , String name) {
        visits.add(new Visit(year,month, day, hour, minutes , name));
    }

    public void countVisitsProgrammed(){
        System.out.println("you have: "  + " visit programmed!...");
    }




    @Override
    public String toString() {
        return "DoctorOffice{" +
                "nameDoctor='" + nameDoctor + '\'' +
                ", medicalSpecialty='" + medicalSpecialty + '\'' +
                ", visits=" + visits +
                '}';
    }


    public static void main(String[] args) {
        ArrayList<Visit> visits = new ArrayList<>();
        DoctorOffice doctorOffice = new DoctorOffice("Joaquin", "Gastroenterologist", visits);
        doctorOffice.countVisitsProgrammed();

    }
}
