package utils;

import java.util.*;
import java.util.regex.*;

public class Regex {
    static Scanner sc = new Scanner(System.in);

    public static String validateName() {
        final String REGEX_NAME = "^([A-Z]([a-z]+ ))+[A-Z][a-z]+$";
        String name;
        do {
            System.out.println("Enter name that is capitalized on the first letter of each word." +
                    " For Example: Wayne Rooney");
            name = sc.nextLine();
            if (!name.matches(REGEX_NAME)) {
                System.out.println("NAME IS INVALID!");
            }
        } while (!name.matches(REGEX_NAME));
        return name;
    }

    public static String validateGender() {
        final String REGEX_GENDER = "^true|false$";
        String gender;
        do {
            System.out.println("Enter gender (true|Male) (false|Female)");
            gender = sc.nextLine();
            if (!gender.matches(REGEX_GENDER)){
                System.out.println("GENDER IS INVALID!");
            }
        }while (!gender.matches(REGEX_GENDER));
        return gender;
    }

    public static String validatePhoneNumber() {
        final String REGEX_PHONE_NUMBER = "^0[0-9]{9}$";
        String phoneNumber;
        do {
            System.out.println("Enter phone number in format (0)-xxxxxxxxx with 'xxxxxxxxx' in 0-9: ");
            phoneNumber = sc.nextLine();
            if (!phoneNumber.matches(REGEX_PHONE_NUMBER)) {
                System.out.println("PHONE NUMBER IS INVALID!");
            }
        } while (!phoneNumber.matches(REGEX_PHONE_NUMBER));
        return phoneNumber;
    }

    public static String validateEmail() {
        final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String email;
        do {
            System.out.println("Enter email: ");
            email = sc.nextLine();
            if (!email.matches(REGEX_EMAIL)) {
                System.out.println("EMAIL IS INVALID!");
            }
        } while (!email.matches(REGEX_EMAIL));
        return email;
    }

    public static String validateEmployeeID() {
        final String REGEX_EMPLOYEE_ID = "^NV-\\d{4}$";
        String employeeID;
        do {
            System.out.println("Enter employee ID in form (NV-xxxx) with 'xxxx' = 0-9: ");
            employeeID = sc.nextLine();
            if (!employeeID.matches(REGEX_EMPLOYEE_ID)) {
                System.out.println("EMPLOYEE ID IS INVALID!");
            }
        } while (!employeeID.matches(REGEX_EMPLOYEE_ID));
        return employeeID;
    }
    public static String validateCustomerID() {
        final String REGEX_CUSTOMER_ID = "^KH-\\d{4}$";
        String customerID;
        do {
            System.out.println("Enter customer ID in form (KH-xxxx) with 'xxxx' = 0-9: ");
            customerID = sc.nextLine();
            if (!customerID.matches(REGEX_CUSTOMER_ID)) {
                System.out.println("CUSTOMER ID IS INVALID!");
            }
        } while (!customerID.matches(REGEX_CUSTOMER_ID));
        return customerID;
    }

    public static int validateAcademicLevel() {
        final String REGEX_ACADEMIC_LEVEL = "^[1-4]{1}$";
        String level;
        do {
            System.out.println("Enter academic level as following choice (1-Trung cấp) (2-Cao đẳng) (3-Đại học) (4-Sau đại học): ");
            level = sc.nextLine();
            if (!level.matches(REGEX_ACADEMIC_LEVEL)) {
                System.out.println("CHOICE IS INVALID!");
            }
        } while (!level.matches(REGEX_ACADEMIC_LEVEL));
        return Integer.parseInt(level);
    }

    public static int validatePosition() {
        final String REGEX_POSITION = "^[1-6]{1}$";
        String position;
        do {
            System.out.println("Enter position as following choice " +
                    "(1-lễ tân) " +
                    "(2-phục vụ) " +
                    "(3-chuyên viên) " +
                    "(4-giám sát)" +
                    "(5-quản lý)" +
                    "(6-giám đốc)" +
                    ": ");
            position = sc.nextLine();
            if (!position.matches(REGEX_POSITION)) {
                System.out.println("CHOICE IS INVALID!");
            }
        } while (!position.matches(REGEX_POSITION));
        return Integer.parseInt(position);
    }
    public static int validateCustomerType() {
        final String REGEX_CUSTOMER_TYPE = "^[1-5]{1}$";
        String type;
        do {
            System.out.println("Enter position as following choice " +
                    "(1-Member) " +
                    "(2-Silver) " +
                    "(3-Gold) " +
                    "(4-Platinum)" +
                    "(5-Diamond)" +
                    ": ");
            type = sc.nextLine();
            if (!type.matches(REGEX_CUSTOMER_TYPE)) {
                System.out.println("CHOICE IS INVALID!");
            }
        } while (!type.matches(REGEX_CUSTOMER_TYPE));
        return Integer.parseInt(type);
    }

    public static int validateSalary() {
        int salary;
        do {
            System.out.println("Enter salary that is greater 0: ");
            salary = Integer.parseInt(sc.nextLine());
            if (salary <= 0) {
                System.out.println("SALARY IS INVALID!");
            }
        } while (salary <= 0);
        return salary;
    }

    public static String validateIDCard() {
        final String REGEX_ID_CARD = "^[0-9]{9}$|^[0-9]{12}$";
        String id;
        do {
            System.out.println("Enter ID card in form of 9 digits or 12 digits: ");
            id = sc.nextLine();
            if (!id.matches(REGEX_ID_CARD)) {
                System.out.println("ID IS INVALID!");
            }
        } while (!id.matches(REGEX_ID_CARD));
        return id;
    }
    public static int checkIntegerParseInt(){
        int value;
        while (true){
            try {
                value = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Enter again: ");
            }
        }
        return value;
    }
}
