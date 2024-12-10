package medicalappointmentmanagement.models;

import java.time.LocalDateTime;

public class Visit {
    private int numberVisit;
    private LocalDateTime dateVisitMedical;
    private String patientName;
    private static int counterNumberVisit = 0;

    public Visit(int year, int month, int day, int hour, int minutes , String patientName) {
//        this.dateVisitMedical = LocalDateTime.;
        this.numberVisit = counterNumberVisit++;
        this.dateVisitMedical = LocalDateTime.of(year,month,day,hour,minutes);
        this.patientName = patientName;
    }

    public Visit(LocalDateTime dateVisitMedical, String patientName) {
//        this.dateVisitMedical = LocalDateTime.;
        this.numberVisit = counterNumberVisit++;
        this.dateVisitMedical = dateVisitMedical;
        this.patientName = patientName;
    }



    public int getNumberVisit() {
        return numberVisit;
    }

    public void setNumberVisit(int numberVisit) {
        this.numberVisit = numberVisit;
    }

    public static void getCounterNumberVisit() {
        System.out.println(counterNumberVisit);
    }



    public LocalDateTime getDateVisitMedical() {
        return dateVisitMedical;
    }

    public void setDateVisitMedical(LocalDateTime dateVisitMedical) {
        this.dateVisitMedical = dateVisitMedical;
    }

    public String getpatientName() {
        return patientName;
    }

    public void setpatientName(String name) {
        this.patientName = name;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "numberVisit=" + numberVisit +
                ", dateVisitMedical=" + dateVisitMedical +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
