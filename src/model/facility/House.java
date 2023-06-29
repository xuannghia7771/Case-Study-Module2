package model.facility;

public class House extends TypeOfRoom {
    public House() {

    }

    public House(int roomType, int floors) {
        super(roomType, floors);
    }

    public House(String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType, int roomType, int floors) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType, roomType, floors);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
