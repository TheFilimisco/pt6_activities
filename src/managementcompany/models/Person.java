package managementcompany.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Person {
    private String dni;
    private String name;
    private ArrayList<Contract> contracts;

    public Person(String dni, String name, Contract contract) {
        this.dni = dni;
        this.name = name;
        this.contracts = new ArrayList<>();
        contracts.add(contract);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public void getTotalTimeInDaysOfContracts(){
        var year = 0;
        var month = 0;
        var day = 0;
        for (Contract contract: contracts) {
            year += (contract.getEndDate().getYear()-contract.getStartDate().getYear());
            month += (contract.getEndDate().getMonthValue()-contract.getStartDate().getMonthValue());
            day += (contract.getEndDate().getDayOfMonth()-contract.getStartDate().getDayOfMonth());
//            contract.getStartDate()-contract.getEndDate();
        }
        System.out.println("Year: " + year + " Month: " + month + " day: " + day);
        System.out.println("Total days: " + ((year*365) + (month*30) + day));
    }

    public void thisPersonHasWorked(){
        for (Contract contract: contracts) {
            System.out.println(contract.getCompany().getName());
        }
    }

    public void addNewContract(Company company, int inputYear, int inputMonth, int inputDayOfMonth) {
        contracts.add(new Contract(LocalDate.now(), LocalDate.of(inputYear,inputMonth,inputDayOfMonth),company));
    }

    public void searchThisContract(Contract contract) {
        for (Contract con: contracts) {
            if (con.getCodeContract()==contract.getCodeContract()){
                var year = con.getEndDate().getYear()-contract.getStartDate().getYear();
                var month = con.getEndDate().getMonthValue()-contract.getStartDate().getMonthValue();
                var day = con.getEndDate().getDayOfMonth()-contract.getStartDate().getDayOfMonth();
                System.out.println(contract);
                System.out.println("Total days: " + ((year*365) + (month*30) + day));
            }
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", contracts=" + contracts +
                '}';
    }


//    public static void main(String[] args) {
//        Company company = new Company("X00000000", "Company1", "Big");
//        Company company1 = new Company("X00000001", "Company2", "Small");
//        Company company2 = new Company("X00000001", "Company2", "Medium");
//
//        LocalDate today = LocalDate.now();
//        LocalDate specificDate = LocalDate.of(2014, Month.JANUARY, 1);
//        LocalDate specificDate2 = LocalDate.of(2014, Month.FEBRUARY, 1);
//
//        Contract contract = new Contract(1, specificDate, today, company );
//        Contract contract1 = new Contract(2,specificDate2, today , company1);
////        System.out.println(contract);
//
//        Person person = new Person("99999999X", "Subject1", contract);
//        person.getContracts().add(contract1);
//
//        System.out.println(person);
//        person.getTotalTimeInDaysOfContracts();
//        person.thisPersonHasWorked();
//        person.addNewContract(company2);
//        person.thisPersonHasWorked();
//
//        for (Contract con: person.contracts){
//            System.out.println(con);
//        }
//
//        person.searchThisContract(contract);
//    }
}

