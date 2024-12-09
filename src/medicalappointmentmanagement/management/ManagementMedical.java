package medicalappointmentmanagement.management;

import medicalappointmentmanagement.models.DoctorOffice;
import medicalappointmentmanagement.models.Visit;

import java.util.ArrayList;

public class ManagementMedical {
    private ArrayList<Visit> visits;
    private ArrayList<DoctorOffice> doctorOffices;



    public ManagementMedical(ArrayList<Visit> visits, ArrayList<DoctorOffice> doctorOffices) {
        this.visits = visits;
        this.doctorOffices = doctorOffices;
    }


    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }

    public ArrayList<DoctorOffice> getDoctorOffices() {
        return doctorOffices;
    }

    public void setDoctorOffices(ArrayList<DoctorOffice> doctorOffices) {
        this.doctorOffices = doctorOffices;
    }

    public void visitProgrammedForThisDoctorOffice(String nameDoctorOffice) {
        for (DoctorOffice docOfic: doctorOffices){
            if (docOfic.getNameDoctor().equals(nameDoctorOffice)){
                docOfic.countVisitsProgrammed();
            }
        }
    }





    @Override
    public String toString() {
        return "ManagementMedical{" +
                "visits=" + visits +
                ", doctorOffices=" + doctorOffices +
                '}';
    }
}
