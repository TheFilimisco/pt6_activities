package medicalappointmentmanagement.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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


    public boolean isPossibleAddThisVisit(Visit inputvisit){
        for (Visit visit: visits) {
            if (ChronoUnit.MINUTES.between(visit.getDateVisitMedical(),inputvisit.getDateVisitMedical()) < 30){
                return false;
            }
        }
        return true;
    }

    public int getNumberVisitsProgrammed(){
        var counterVisit = 0;
        for (int i = 0; i < visits.size(); i++) {
            counterVisit++;
        }
        return counterVisit;
    }

    public void getVisitsProgrammedBetweenBothDate(LocalDateTime firstDate, LocalDateTime secondDate){
        for (Visit visit: visits) {
            if (visit.getDateVisitMedical().isAfter(firstDate) && visit.getDateVisitMedical().isBefore(secondDate)){
                System.out.println(visit);
            }
        }
    }

    public void deleteVisitedForNumberVisit(int numberVisit) {
        for (Visit visit:visits) {
            if (visit.getNumberVisit() == numberVisit) {
                System.out.println("Remove : " + visit + "...");
                visits.remove(visit);
                break;
            }
        }
    }



    public void getNumberVisits() {
        Visit.getCounterNumberVisit();
    }



    @Override
    public String toString() {
        return "DoctorOffice{" +
                "nameDoctor='" + nameDoctor + '\'' +
                ", medicalSpecialty='" + medicalSpecialty + '\'' +
                ", visits=" + visits +
                '}';
    }


}
