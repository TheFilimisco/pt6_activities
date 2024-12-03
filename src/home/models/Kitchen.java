package home.models;

public class Kitchen {
    private boolean itsIndepent;
    private int numberOfStoves;

    public Kitchen() {
        this.itsIndepent = false;
        this.numberOfStoves = 0;
    }

    public Kitchen(boolean itsIndepent, int numberOfStoves) {
        this.itsIndepent = itsIndepent;
        this.numberOfStoves = numberOfStoves;
    }

    public boolean isItsIndepent() {
        return itsIndepent;
    }

    public void setItsIndepent(boolean itsIndepent) {
        this.itsIndepent = itsIndepent;
    }

    public int getNumberOfStoves() {
        return numberOfStoves;
    }

    public void setNumberOfStoves(int numberOfStoves) {
        this.numberOfStoves = numberOfStoves;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "itsIndepent=" + itsIndepent +
                ", numberOfStoves=" + numberOfStoves +
                '}';
    }

}
