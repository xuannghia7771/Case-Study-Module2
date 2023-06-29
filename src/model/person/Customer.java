package model.person;

import java.util.*;

public class Customer extends Person {
    private String customerID;
    private int customerType;
    private String address;
    static Map<Integer, String> customerTypeMap = new HashMap<>();

    static {
        customerTypeMap.put(1, "Member");
        customerTypeMap.put(2, "Silver");
        customerTypeMap.put(3, "Gold");
        customerTypeMap.put(4, "Platinum");
        customerTypeMap.put(5, "Diamond");
    }

    public Customer() {

    }

    public Customer(String customerID, int customerType, String address) {
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String birthday, int gender, String IDCard, String phoneNumber, String email, String customerID, int customerType, String address) {
        super(name, birthday, gender, IDCard, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        /*Customer(String customerID, int customerType, String address)*/
        return super.toString() + String.format("%s|%s|%s|",
                getCustomerID(),
                customerTypeMap.get(customerType),
                getAddress());
    }
}
