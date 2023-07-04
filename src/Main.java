import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean is18YearsOld(String dateOfBirth) {
        String regex = "^((0[1-9])|([1-2][0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([1-2][0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateOfBirth);

        if (matcher.matches()) {
            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));

            boolean isLeap = isLeapYear(year);

            boolean isFebruaryValid = (month == 2 && day <= (isLeap ? 29 : 28));

            Calendar currentDate = Calendar.getInstance();
            int currentYear = currentDate.get(Calendar.YEAR);
            int currentMonth = currentDate.get(Calendar.MONTH) + 1;
            int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);

            int age = currentYear - year;

            if (age > 18 || (age == 18 && (
                    currentMonth > month ||
                            (currentMonth == month && currentDay >= day) ||
                            (currentMonth == month && currentDay == day && isFebruaryValid)
            ))) {
                return true;
            }
        }

        return false;
    }
    public static String validateBirth(){
        String date;
        do {
            System.out.println("Enter birthday: ");
            date = sc.nextLine();
            if (!is18YearsOld(date)){
                System.out.println("INVALID BIRTHDAY!");
            }
        }while (!is18YearsOld(date));
        return date;
    }
    public static void main(String[] args) {
        String date = validateBirth();
        System.out.println(date);
    }
}