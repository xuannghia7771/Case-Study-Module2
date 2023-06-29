package model.booking;

public class Booking {
    private String bookingID;
    private String bookingDate;
    private String startedDay;
    private String finishedDay;
    private String customerID;
    private String serviceID;

    public Booking() {

    }

    public Booking(String bookingID, String bookingDate, String startedDay, String finishedDay, String customerID, String serviceID) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.startedDay = startedDay;
        this.finishedDay = finishedDay;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartedDay() {
        return startedDay;
    }

    public void setStartedDay(String startedDay) {
        this.startedDay = startedDay;
    }

    public String getFinishedDay() {
        return finishedDay;
    }

    public void setFinishedDay(String finishedDay) {
        this.finishedDay = finishedDay;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        /*Booking(String bookingID, String bookingDate, String startedDay, String finishedDay, String customerID, String serviceID)*/
        return String.format("|%s|%s|%s|%s|%s|%s|",getBookingID(),getBookingDate(),getStartedDay(),getFinishedDay(),getCustomerID(),getServiceID());
    }
}
