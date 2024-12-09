package telephony.test;

import telephony.controller.ManagementTelephony;
import telephony.models.Call;
import telephony.models.Client;
import telephony.models.Invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTelephony {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Call> calls = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        ManagementTelephony managementTelephony = new ManagementTelephony(clients,calls,invoices);

        boolean runing = true;


        // This I'd like correct this code


        while (runing) {
            System.out.println("""
                ==================Menu===================
                ================Telephony================
                1. Add Client
                2. Add Call to Client
                3. Get Invoice of a Client
                4. Show List of Clients with their Invoice
                5. Close
                6. Show Clients, Calls and Invoices
                ==========================================
                """);
            System.out.print("Enter a number valid: ");
            int optionNumber = input.nextInt();
            switch (optionNumber) {
                case 1:
                    input.nextLine();
                    System.out.println("===========Add Client=========");
                    System.out.print("Enter your dni: ");
                    String dni = input.nextLine();
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your price Call to Minute: ");
                    double priceCallForMinutes = input.nextDouble();
                    System.out.print("Enter your new Number: ");
                    long number = input.nextLong();
                    managementTelephony.addNewClient(new Client(dni,name,priceCallForMinutes,number));
                    break;
                case 2:
                    System.out.println("=============Add Call to Client=============");
                    System.out.print("Enter your duration(seconds): ");
                    int seconds = input.nextInt();
                    System.out.print("Enter your Destination Number: " );
                    int destinationNumber = input.nextInt();
                    System.out.print("Enter your number: ");
                    long numberOwn = input.nextLong();
                    try {
                        managementTelephony.addCallToClient(new Call(seconds,destinationNumber),searchClient(numberOwn,clients));

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
//                    managementTelephony.addCallToClient(new Call(seconds,destinationNumber),numberOwn);
                    break;
                case 3:
                    System.out.println("======================Get Invoice of Client==================");
                    System.out.print("Enter your number: ");
                    long numberOwnForInvoice = input.nextLong();
                    try {
                        managementTelephony.getInvoiceOfClient(searchClient(numberOwnForInvoice,clients));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("======================Show List of Clients with their Invoices==================");
                    managementTelephony.showListClientsResume();
                    break;
                case 5:
                    runing = false;
                    break;

                case 6:
                    System.out.println("==============Show All========");
                    for (Call call: calls) {
                        System.out.println(call);
                    }
                    for (Client client: clients) {
                        System.out.println(client);
                    }
                    for (Invoice invoice: invoices) {
                        System.out.println(invoice);
                    }

                    break;
                default:
                    System.out.println("Type Wright value!");
                    break;
            }
        }




//        //add new clients
//        Client client = new Client("54910978L","Steven", 1.20,654583224);
//        managementTelephony.addNewClient(client);
//        Client client2 = new Client("54910978L","Steven", 1.20,654583224);
//        managementTelephony.addNewClient(client2);
//        Client client3 = new Client("54910978X","Steven", 1.20,654583224);
//        managementTelephony.addNewClient(client3);
//        Client client4 = new Client("54910978S","Steven", 1.20,654583224);
//        managementTelephony.addNewClient(client4);
//
//        for (Client cli: clients){
//            System.out.println(cli);
//        }
//
//        //addCall to Clients
//        Call call1 = new Call(2000, 542839893);
//        Call call2 = new Call(3000, 542839892);
//        Call call3 = new Call(2000, 542839891);
//
//        //Created List of Calls to Client1
//        ArrayList<Call> callsClient = new ArrayList<>();
//        Invoice invoice1 = new Invoice(client,callsClient);
//
//
//        invoices.add(invoice1);
//
//        //Add More Calls
//        managementTelephony.addCallToClient(call1,client);
//        managementTelephony.addCallToClient(call2,client);
//        managementTelephony.addCallToClient(call3,client);
//
//        System.out.println(invoice1);
//
//        managementTelephony.getInvoiceOfClient(client);
//
//        ArrayList<Call> callsClient2 = new ArrayList<>();
//        Invoice invoice2 = new Invoice(client2,callsClient2);
//        invoices.add(invoice2);
//
//
//        System.out.println("===================================");
//
//        managementTelephony.showListClientsResume();

    }

    private static Client searchClient(long inputNumberClient,ArrayList<Client> clients) {
        for (Client client: clients){
            if (client.getNumber()==inputNumberClient) {
                return client;
            }
        }
        throw new IllegalArgumentException("The Client with number: " + inputNumberClient + " Doesnt exist!");
    }



}
