package model.person;

import java.util.*;

public abstract class Person {
    /*Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email*/
    private String name;
    private String birthday;
    private boolean gender;
    private String IDCard;
    private String phoneNumber;
    private String email;

    public Person() {

    }

    public Person(String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email) {
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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
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
        return String.format("|%s|%s|%s|%s|%s|%s", getName(), getBirthday(), getGender(), getIDCard(), getPhoneNumber(), getEmail());
    }
}
