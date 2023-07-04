package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexAge {
    static Scanner sc = new Scanner(System.in);

    public static int[] changeDateStrToNumArr(String strDate) {
        String[] strArr = strDate.split("/");
        int day = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int year = Integer.parseInt(strArr[2]);
        int[] newDateArray = new int[3];
        newDateArray[0] = day;
        newDateArray[1] = month;
        newDateArray[2] = year;
        return newDateArray;
    }

    public static String getDateString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(new Date());
    }

    public static boolean isEnough18(int[] presentDate, int[] inputDate) {
        int compareYear = presentDate[2] - inputDate[2];
        if (compareYear > 18) {
            return true;
        } else if (compareYear == 18){
            if (inputDate[1] - presentDate[1] < 0){
                return true;
            } else if (inputDate[1] - presentDate[1] == 0) {
                if (inputDate[0] - presentDate[0] <= 0){
                    return true;
                } else {
                    return false;
                }
            } else if (inputDate[1] - presentDate[1] > 0) {
                return false;
            }
        }
        return false;
    }
    public static String validateBirth () {
        final String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
        String date;
        while (true) {
            System.out.println("Enter birthday in format dd/mm/yyyy: ");
            date = sc.nextLine();
            if (date.matches(REGEX_DATE)) {
                if (isEnough18(changeDateStrToNumArr(getDateString()), changeDateStrToNumArr(date))) {
                    break;
                } else {
                    System.out.println("EMPLOYEE IS NOT ENOUGH 18 YEARS OLD!");
                }
            } else {
                System.out.println("INVALID BIRTHDAY!");
            }
        }
        return date;
    }

    public static void main(String[] args) {
        String date = validateBirth();
        System.out.println(date);
    }
}
