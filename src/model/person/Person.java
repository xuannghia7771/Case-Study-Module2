package model.person;

import java.util.*;

public abstract class Person {
    /*Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email*/
    private String name;
    private String birthday;
    private int gender;
    private String IDCard;
    private String phoneNumber;
    private String email;

    static Map<Integer, String> genderMap = new HashMap<>();

    static {
        genderMap.put(0, "Female");
        genderMap.put(1, "Male");
    }

    public Person() {

    }

    public Person(String name, String birthday, int gender, String IDCard, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.IDCard = IDCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        /*Person(String name, String birthday, int gender, String IDCard, String phoneNumber, String email)*/
        return String.format("|%s|%s|%s|%s|%s|%s", getName(), getBirthday(), genderMap.get(gender), getIDCard(), getPhoneNumber(), getEmail());
    }
}
