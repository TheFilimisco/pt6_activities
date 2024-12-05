package telephony.models;

import java.util.ArrayList;

public class Invoice {
    private int idInvoice;
    private Client client;
    private ArrayList<Call> calls;
    private static int countInvoice = 0;

    public Invoice(Client client, ArrayList<Call> calls) {
        this.idInvoice = countInvoice++;
        this.client = client;
        this.calls = calls;
    }



    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice=" + idInvoice +
                ", client=" + client +
                ", calls=" + calls +
                '}';
    }
}
