package model.facility;

import java.util.HashMap;
import java.util.Map;

public abstract class TypeOfRoom extends Facility {
    private int roomType;
    private int floors;
    static Map<Integer, String> roomTypeMap = new HashMap<>();

    static {
        roomTypeMap.put(1, "Standard");
        roomTypeMap.put(2, "Superior");
        roomTypeMap.put(3, "Deluxe");
        roomTypeMap.put(4, "Suite");
    }

    public TypeOfRoom() {
    }

    public TypeOfRoom(int roomType, int floors) {
        this.roomType = roomType;
        this.floors = floors;
    }

    public TypeOfRoom(String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType, int roomType, int floors) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomType = roomType;
        this.floors = floors;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return String.format("|%s|%s|%s|%s|%s|%s|%s|%s|",
                getServiceID(),
                getServiceName(),
                getUsableArea(),
                getRentalCost(),
                getMaxPeople(),
                Facility.rentalTypeMap.get(getRentalType()),
                TypeOfRoom.roomTypeMap.get(getRoomType()),
                getFloors());
    }
}
