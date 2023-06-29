package model.facility;

import java.util.*;

public abstract class Facility {
    private String serviceID;
    private String serviceName;
    private double usableArea;
    private int rentalCost;
    private int maxPeople;
    private int rentalType;
    static Map<Integer, String> rentalTypeMap = new HashMap<>();

    static {
        rentalTypeMap.put(1, "By year");
        rentalTypeMap.put(2, "By month");
        rentalTypeMap.put(3, "By day");
        rentalTypeMap.put(4, "By hour");
    }

    public Facility() {

    }

    public Facility(String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }


}
