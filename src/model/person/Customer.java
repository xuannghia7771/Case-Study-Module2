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

    public Customer(String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String customerID, int customerType, String address) {
        super(name, birthday, gender, IDCard, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }
    private String customerTypeInString;
    public Customer(String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String customerID, String type, String address) {
        super(name, birthday, gender, IDCard, phoneNumber, email);
        this.customerID = customerID;
        customerTypeInString = type;
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
    public String getInfo(){
        /*String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String customerID, int customerType, String address*/
        return getName()+","+getBirthday()+","+getGender()+","+getIDCard()+","+getPhoneNumber()+","+getEmail()+","+getCustomerID()+","+customerTypeMap.get(getCustomerType())+","+getAddress();
    }
    @Override
    public String toString() {
        /*Customer(String customerID, int customerType, String address)*/
        return super.toString() + String.format("|%s|%s|%s|",
                getCustomerID(),
                getCustomerTypeInString(),
                getAddress());
    }

    public String getCustomerTypeInString() {
        return customerTypeInString;
    }

    public void setCustomerTypeInString(String customerTypeInString) {
        this.customerTypeInString = customerTypeInString;
    }
}
