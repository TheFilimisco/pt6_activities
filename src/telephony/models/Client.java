package telephony.models;

public class Client {
    private String dni;
    private String name;
    private double priceCallForMinutes; //For minutes
    private long number;

    public Client(String dni, String name, double priceCallForMinutes, long number) {
        this.dni = dni;
        this.name = name;
        this.priceCallForMinutes = priceCallForMinutes;
        this.number = number;
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

    public double getpriceCallForMinutes() {
        return priceCallForMinutes;
    }

    public void setpriceCallForMinutes(double priceCall) {
        this.priceCallForMinutes = priceCall;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", priceCall=" + priceCallForMinutes +
                ", number=" + number +
                '}';
    }
}
