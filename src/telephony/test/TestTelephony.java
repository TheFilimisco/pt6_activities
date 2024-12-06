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


        var runing = true;

        while (runing) {
            System.out.println("""
                ==================Menu===================
                ================Telephony================
                1. Add Client
                2. Add Call to Client
                2. Get Invoice of a Client
                3. Show List of Clients with their Invoice
                4. Show All Clients
                ==========================================
                """);
            System.out.print("Enter a number valid: ");
            int optionNumber = input.nextInt();
            switch (optionNumber) {
                case 1:
                    System.out.println("===========Add Client=========");
                    System.out.print("Enter your dni: ");
                    String dni = input.nextLine();
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your price Call to Minute: ");
                    double priceCallForMinutes = input.nextDouble();
                    System.out.println("Enter your new Number: ");
                    long number = input.nextLong();
                    managementTelephony.addNewClient(new Client(dni,name,priceCallForMinutes,number));
                    System.out.println("Sucessfull!...");
                    break;
                case 2:
                    System.out.println("=============Add Call to Client=============");
                    System.out.print("Enter your duration(seconds): ");
                    int seconds = input.nextInt();
                    System.out.print("Enter your Destination Number: " );
                    int destinationNumber = input.nextInt();
                    System.out.print("Enter your number: ");
                    long numberOwn = input.nextLong();
                    managementTelephony.addCallToClient(new Call(seconds,destinationNumber),searchClient(numberOwn,clients));
//                    managementTelephony.addCallToClient(new Call(seconds,destinationNumber),numberOwn);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("==============Show All Clients========");
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
                case 5:
                    runing = false;
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
        return null;
    }


}
