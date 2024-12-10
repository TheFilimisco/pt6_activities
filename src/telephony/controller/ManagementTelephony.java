package telephony.controller;

import telephony.models.Call;
import telephony.models.Client;
import telephony.models.Invoice;

import java.util.ArrayList;

public class ManagementTelephony {
    private ArrayList<Client> clients;
    private ArrayList<Call> calls;
    private ArrayList<Invoice> invoices;

    public ManagementTelephony() {
    }

    public ManagementTelephony(ArrayList<Client> clients, ArrayList<Call> calls, ArrayList<Invoice> invoices) {
        this.clients = clients;
        clients.add(new Client("00000000X", "Sujeto1", 1.20, 999999991));
        clients.add(new Client("00000001X", "Sujeto2", 1.25, 999999992));
        clients.add(new Client("00000002X", "Sujeto3", 1.10, 999999993));
        this.calls = calls;
        calls.add(new Call(2000, 999999911));
        calls.add(new Call(1800, 999999912));
        calls.add(new Call(3020, 999999913));
        this.invoices = invoices;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public void addNewClient(Client client){
        for (Client cli: clients) {
            if (cli.getDni().equals(client.getDni())){
                System.out.println("Doesn't possible, the DNI already exists");
                return;
            }
        }
        clients.add(client);
        System.out.println("Successful!");
    }

    public void addCallToClient(Call call, Client client ){
        if (invoices.isEmpty()) {
            invoices.add(new Invoice(client,call));
            calls.add(call);
            System.out.println("Invoice make for Client");
            return;
        }
        for (Invoice invoice: invoices) {
            if (invoice.getClient().equals(client)) {
                invoice.getCalls().add(call);
                calls.add(call);
                System.out.println("Successful!...");
                return;
            }
        }
        invoices.add(new Invoice(client,call));
        calls.add(call);
        System.out.println("Invoice make for Client");
    }


    public void getInvoiceOfClient(Client client){
        double totalSeconds = 0;
        for (Invoice invoice: invoices) {
            if (invoice.getClient().equals(client)){
                System.out.println(invoice);
                for (Call call: invoice.getCalls()) {
                    totalSeconds+=call.getDuration();
                }
            }
        }
        System.out.println("====================================");
        System.out.println("Minutes Total of " + client.getDni() + " : "+ changeSecondsForMinutes(totalSeconds));
        System.out.println("Total price Invoice of " + client.getDni() +" : " + changeSecondsForMinutes(totalSeconds)*client.getpriceCallForMinutes());
    }

    public void showListClientsResume(){
        for (Client client: clients) {
            getInvoiceOfClient(client);
        }
    }

    private double changeSecondsForMinutes(double totalSeconds){
        return totalSeconds/60;
    }

    @Override
    public String toString() {
        return "ManagementTelephony{" +
                "clients=" + clients +
                ", calls=" + calls +
                ", invoices=" + invoices +
                '}';
    }

}
