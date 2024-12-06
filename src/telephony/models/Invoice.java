package telephony.models;

import java.util.ArrayList;
import java.util.Objects;

public class Invoice {
    private int idInvoice;
    private Client client;
    private ArrayList<Call> calls;
    private static int countInvoice = 0;

    public Invoice(Client client, Call call) {
        this.idInvoice = countInvoice++;
        this.client = client;
        this.calls = new ArrayList<>();
        calls.add(call);
    }

//    public Invoice(Client client, ArrayList<Call> calls) {
//        this.idInvoice = countInvoice++;
//        this.client = client;
//        this.calls = calls;
//    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return idInvoice == invoice.idInvoice && Objects.equals(client, invoice.client) && Objects.equals(calls, invoice.calls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvoice, client, calls);
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
