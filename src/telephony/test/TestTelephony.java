package telephony.test;

import telephony.models.Call;
import telephony.models.Client;
import telephony.models.Invoice;

import java.util.ArrayList;

public class TestTelephony {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Call> calls = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();


        ManagementTelephony managementTelephony = new ManagementTelephony(clients,calls,invoices);


        //add new clients
        Client client = new Client("54910978L","Steven", 1.20,654583224);
        managementTelephony.addNewClient(client);
        Client client2 = new Client("54910978L","Steven", 1.20,654583224);
        managementTelephony.addNewClient(client2);

        for (Client cli: clients){
            System.out.println(cli);
        }

        //addCall to Clients

        Call call1 = new Call(2000, 542839893);
        ArrayList<Call> callsClient = new ArrayList<>();
        Invoice invoice1 = new Invoice(client,callsClient);

        invoices.add(invoice1);

        managementTelephony.addCallToClient(call1,client,invoices);



    }
}
