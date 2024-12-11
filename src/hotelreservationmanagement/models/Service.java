package hotelreservationmanagement.models;

public class Service {
    private String typeOfService;

    public Service(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Service{" +
                "typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
