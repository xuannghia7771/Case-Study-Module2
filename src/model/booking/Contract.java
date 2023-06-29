package model.booking;

public class Contract {
    private String contractNumber;
    private String bookingID;
    private double deposit;
    private double total;

    public Contract() {

    }

    public Contract(String contractNumber, String bookingID, int deposit, int total) {
        this.contractNumber = contractNumber;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.total = total;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        /*Contract(String contractNumber, String bookingID, int deposit, int total)*/
        return String.format("|%s|%s|%.2f|%.2f|", getContractNumber(), getBookingID(), getDeposit(), getTotal());
    }
}
