package utils;

import java.util.*;
import java.util.regex.*;

public class Regex {
    static Scanner sc = new Scanner(System.in);

    public static String validateName() {
        final String REGEX_NAME = "^([A-Z]([a-z]+ ))+[A-Z][a-z]+$";
        String name;
        do {
            System.out.println("Enter Name: ");
            name = sc.nextLine();
            if (!name.matches(REGEX_NAME)) {
                System.out.println("NAME IS INVALID!");
            }
        } while (!name.matches(REGEX_NAME));
        return name;
    }
    public static String validateBirth(){
        final String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
        String date;
        do {
            System.out.println("Enter Name: ");
            date = sc.nextLine();
            if (!date.matches(REGEX_DATE) && is18Plus(date)) {
                System.out.println("DATE IS INVALID! OR AGE IS NOT ENOUGH 18");
            }
        } while (!date.matches(REGEX_DATE) && is18Plus(date));
        return date;
    }
    public static boolean is18Plus(String dateStr) {
        String[] array = dateStr.split("/");
        Calendar calendar = Calendar.getInstance();
        int year = Integer.parseInt(array[2]) + 18;
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[0]);
        calendar.set(year, month, day);
        Date date = new Date();
        int compare = date.compareTo(calendar.getTime());
        return compare >= 0;
    }
    public static int validateGender() {
        try {
            int gender;
            do {
                System.out.println("Enter Gender (0-Female) (1-Male): ");
                gender = Integer.parseInt(sc.nextLine());
                if (gender != 0 && gender != 1) {
                    System.out.println("GENDER IS INVALID!");
                }
            } while (gender != 0 && gender != 1);
            return gender;
        }catch (Exception e){
            System.out.println("WRONG CHOICE!");
            return validateGender();
        }
    }

    public static String validatePhoneNumber() {
        final String REGEX_PHONE_NUMBER = "^0[0-9]{9}$";
        String phoneNumber;
        do {
            System.out.println("Enter phone number in format (0)-xxxxxxxxx : ");
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
        final String REGEX_EMPLOYEE_ID = "^NV\\-\\d{4}$";
        String employeeID;
        do {
            System.out.println("Enter employee ID in form (NV-xxxx) with 'xxxx' = 0-9: ");
            employeeID = sc.nextLine();
            if (!employeeID.matches(REGEX_EMPLOYEE_ID)) {
                System.out.println("PHONE NUMBER IS INVALID!");
            }
        } while (!employeeID.matches(REGEX_EMPLOYEE_ID));
        return employeeID;
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

    public static int validateSalary() {
        int salary;
        do {
            System.out.println("Enter salary over 0: ");
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
}
