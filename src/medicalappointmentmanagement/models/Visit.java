package medicalappointmentmanagement.models;

import java.time.LocalDateTime;

public class Visit {
    private int numberVisit;
    private LocalDateTime dateVisitMedical;
    private String name;
    private  int counterNumberVisit = 0;

    public Visit(int year, int month, int day, int hour, int minutes , String name) {
//        this.dateVisitMedical = LocalDateTime.;
        this.numberVisit = counterNumberVisit++;
        this.dateVisitMedical = LocalDateTime.of(year,month,day,hour,minutes);
        this.name = name;
    }

    public int getNumberVisit() {
        return numberVisit;
    }

    public void setNumberVisit(int numberVisit) {
        this.numberVisit = numberVisit;
    }

    public int getCounterNumberVisit() {
        return counterNumberVisit;
    }

    public void setCounterNumberVisit(int counterNumberVisit) {
        this.counterNumberVisit = counterNumberVisit;
    }

    public LocalDateTime getDateVisitMedical() {
        return dateVisitMedical;
    }

    public void setDateVisitMedical(LocalDateTime dateVisitMedical) {
        this.dateVisitMedical = dateVisitMedical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "numberVisit=" + numberVisit +
                ", dateVisitMedical=" + dateVisitMedical +
                ", name='" + name + '\'' +
                ", counterNumberVisit=" + counterNumberVisit +
                '}';
    }
}
