package telephony.test;

import telephony.models.Call;
import telephony.models.Client;
import telephony.models.Invoice;

import java.util.ArrayList;

public class ManagementTelephony {
    private ArrayList<Client> clients;
    private ArrayList<Call> calls;
    private ArrayList<Invoice> invoices;

    public ManagementTelephony(ArrayList<Client> clients, ArrayList<Call> calls, ArrayList<Invoice> invoices) {
        this.clients = clients;
        this.calls = calls;
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
    }

    public void addCallToClient(Call call, Client client ,ArrayList<Invoice> invoices){
        for (Invoice inv: invoices) {
            if (inv.getClient().equals(client)) {
                inv.getCalls().add(call);
                System.out.println("Sucessfull!...");
            } else {
                System.out.println("Error, to write rigth values!");
            }
        }

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
