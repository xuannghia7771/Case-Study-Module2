package model.facility;

public class Villa extends TypeOfRoom {
    private double poolArea;

    public Villa() {
        super();
    }

    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(int roomType, int floors, double poolArea) {
        super(roomType, floors);
        this.poolArea = poolArea;
    }

    public Villa(String serviceID, String serviceName, double usableArea, int rentalCost, int maxPeople, int rentalType, int roomType, int floors, double poolArea) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType, roomType, floors);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s|", getPoolArea());
    }
}
