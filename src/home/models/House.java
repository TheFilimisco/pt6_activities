package home.models;

public class House {
    private double surface;
    private String homeAddress;
    private LivingRoom livingRoomHouse;
    private Kitchen kitchenHouse;

    public House() {
        this.surface = 0;
        this.homeAddress = "Unknown";
        this.livingRoomHouse = new LivingRoom();
        this.kitchenHouse = new Kitchen();
    }

    public House(double surface, String homeAddress, LivingRoom livingRoomHouse, Kitchen kitchenHouse) {
        this.surface = surface;
        this.homeAddress = homeAddress;
        this.livingRoomHouse = livingRoomHouse;
        this.kitchenHouse = kitchenHouse;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public LivingRoom getLivingRoomHouse() {
        return livingRoomHouse;
    }

    public void setLivingRoomHouse(LivingRoom livingRoomHouse) {
        this.livingRoomHouse = livingRoomHouse;
    }

    public Kitchen getKitchenHouse() {
        return kitchenHouse;
    }

    public void setKitchenHouse(Kitchen kitchenHouse) {
        this.kitchenHouse = kitchenHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "surface=" + surface +
                ", homeAdress='" + homeAddress + '\'' +
                ", livingRoomHouse=" + livingRoomHouse +
                ", kitchenHouse=" + kitchenHouse +
                '}';
    }
}
