package managementcompany.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contract {
    private long codeContract;
    private LocalDate startDate;
    private LocalDate endDate;
    private Company company;

    public Contract(long codeContract, LocalDate startDate, LocalDate endDate, Company company) {
        this.codeContract = codeContract;
        this.startDate = startDate;
        this.endDate = endDate;
        this.company = company;
    }

    public long getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(long codeContract) {
        this.codeContract = codeContract;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeContract=" + codeContract +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", company=" + company +
                '}';
    }


}
