package model.person;

import java.util.*;

public class Employee extends Person {
    private String employeeID;
    private int academicLevel;
    private int position;
    private int salary;

    static Map<Integer, String> levelMap = new HashMap<>();
    static Map<Integer, String> positionMap = new HashMap<>();

    static {
        levelMap.put(1, "Trung cấp");
        levelMap.put(2, "Cao đẳng");
        levelMap.put(3, "Đại học");
        levelMap.put(4, "Sau đại học");
        positionMap.put(1, "lễ tân");
        positionMap.put(2, "phục vụ");
        positionMap.put(3, "chuyên viên");
        positionMap.put(4, "giám sát");
        positionMap.put(5, "quản lý");
        positionMap.put(6, "giám đốc");
    }

    public Employee() {

    }

    public Employee(String employeeID, int academicLevel, int position, int salary) {
        this.employeeID = employeeID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String birthday, int gender, String IDCard, String phoneNumber, String email, String employeeID, int academicLevel, int position, int salary) {
        super(name, birthday, gender, IDCard, phoneNumber, email);
        this.employeeID = employeeID;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(int academicLevel) {
        this.academicLevel = academicLevel;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getInfo(){
        /*String name, String birthday, int gender, String IDCard, String phoneNumber, String email, String employeeID, int academicLevel, int position, int salary*/
        return getName()+","+getBirthday()+","+Person.genderMap.get(getGender())+","+getIDCard()+","+getPhoneNumber()+","+getEmail()+","+getEmployeeID()+","+levelMap.get(getAcademicLevel())+","+positionMap.get(getPosition())+","+getSalary();
    }

    @Override
    public String toString() {
        /*Employee(String employeeID, int academicLevel, int position, int salary)*/
        return super.toString() + String.format("%s|%s|%s|%s",
                getEmployeeID(),
                levelMap.get(getAcademicLevel()),
                positionMap.get(getPosition()),
                getSalary());
    }
}
