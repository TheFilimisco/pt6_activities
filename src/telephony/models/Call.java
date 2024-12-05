package telephony.models;

public class Call {
    private int idCall;
    private int duration;
    private int destinationNumber;
    private static int countCall=0;

    public Call(int duration, int destinationNumber) {
        this.idCall = countCall++;
        this.duration = duration;
        this.destinationNumber = destinationNumber;
    }

    public int getIdCall() {
        return idCall;
    }

    public void setIdCall(int idCall) {
        this.idCall = idCall;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(int destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "idCall=" + idCall +
                ", duration=" + duration +
                ", destinationNumber=" + destinationNumber +
                '}';
    }
}
