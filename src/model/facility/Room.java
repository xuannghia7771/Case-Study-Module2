package model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType, String freeService) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        /*String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType, String freeService*/
        return String.format("|%s|%s|%s|%s|%s|%s|%s|",
                getServiceID(),
                getServiceName(),
                getUsableArea(),
                getRentalCost(),
                getMaxPeople(),
                Facility.rentalTypeMap.get(getRentalType()),
                getFreeService());
    }
}
