package managementcompany.test;

import managementcompany.models.Company;
import managementcompany.models.Contract;
import managementcompany.models.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCompany {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Company> companies = new ArrayList<>();
        Company company = new Company("X00000000", "Company1", "Big");
        Company company1 = new Company("X00000001", "Company2", "Small");
        Company company2 = new Company("X00000001", "Company2", "Medium");

        companies.add(company);
        companies.add(company1);
        companies.add(company2);

//        ArrayList<Contract> contracts = new ArrayList<>();

        Contract contract = new Contract(LocalDate.of(2012, Month.JANUARY,2),LocalDate.of(2013,Month.MARCH,2),company);
        Contract contract1 = new Contract(LocalDate.of(2013, Month.FEBRUARY,3),LocalDate.of(2014,Month.FEBRUARY,3),company);
        Contract contract2 = new Contract(LocalDate.of(2014, Month.JANUARY,2),LocalDate.of(2015,Month.JANUARY,2),company);
        Contract contract3 = new Contract(LocalDate.of(2012, Month.JANUARY,2),LocalDate.of(2013,Month.JANUARY,2),company);
        Contract contract4 = new Contract(LocalDate.of(2012, Month.JANUARY,2),LocalDate.of(2013,Month.JANUARY,2),company);

//        contracts.add(contract);
//        contracts.add(contract1);
//        contracts.add(contract2);
//        contracts.add(contract3);
//        contracts.add(contract4);



        ArrayList<Person> people = new ArrayList<>();

        Person person = new Person("99999999X", "Subject1", contract);
        Person person1 = new Person("99999999M", "Subject2", contract2);
        Person person2 = new Person("99999999S", "Subject3", contract3);
        Person person3 = new Person("99999999O", "Subject4", contract4);


        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);


        var runing = true;

        while (runing) {
            System.out.println("""
                1. Duration total by Person through days
                2. Companies has been Worked
                3. New Contract for a Company
                4. Duration of a specific contract
                """);
            System.out.print("Enter your number: ");
            var inputNumber = input.nextInt();

            switch (inputNumber){
                case 1:
                    input.nextLine();
                    System.out.println("===============Duration total by Person==============");
                    try {
                        System.out.print("Enter your dni:");
                        var inputDni = input.nextLine();
                        searchPersonForDni(inputDni,people).getTotalTimeInDaysOfContracts();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("==========Compaines has been Worked a Person======");
                    try {
                        System.out.print("Enter your dni:");
                        var inputDni = input.nextLine();
                        searchPersonForDni(inputDni,people).thisPersonHasWorked();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("==========New Contract for a Company======");
                    try {
                        System.out.print("Enter your dni:");
                        var inputDni = input.nextLine();
                        System.out.print("Enter cif of your company:" );
                        var inputCfi = input.nextLine();
                        System.out.println("Enter Year will finish contract: ");
                        var inputYear = input.nextInt();
                        System.out.println("Enter Month will finish contract: ");
                        var inputMonth = input.nextInt();
                        System.out.println("Enter Day will finish contract: ");
                        var inputDay = input.nextInt();
                        searchPersonForDni(inputDni,people).addNewContract(searchBusinessForCfi(inputCfi,companies),inputYear,inputMonth,inputDay);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("==========Duration of Specific Contract ======");
                    try {
                        System.out.print("Enter your dni:");
                        var inputDni = input.nextLine();
                        System.out.print("Enter Code Contract than you find:");
                        var inputCodeContract = input.nextLong();
                        searchContractForCodeContract(inputCodeContract,searchPersonForDni(inputDni,people).getContracts());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    runing = false;
                    break;
                default:
                    System.out.println("Error, Do write right number!");
                    break;
            }
        }
    }

    public static Person searchPersonForDni(String inputDni, ArrayList<Person> people){
        for (Person person: people){
            if (person.getDni().equals(inputDni)){
                return person;
            }
        }
        throw  new IllegalArgumentException("The person with DNI: " + inputDni + " doesn't exist!");

    }

    public static Company searchBusinessForCfi(String inputCfi, ArrayList<Company> companies){
        for (Company company: companies){
            if (company.getCif().equals(inputCfi)){
                return company;
            }
        }
        throw  new IllegalArgumentException("The Company with CFI: " + inputCfi + " doesn't exist!");

    }

    public static void searchContractForCodeContract(long inputCodeContract, ArrayList<Contract> contracts){
        for (Contract contract: contracts){
            if ((contract.getCodeContract() == inputCodeContract)){
                System.out.println(contract);
                return;
            }
        }
        throw  new IllegalArgumentException("The contract with Code: " + inputCodeContract + " doesn't exist!");

    }



}