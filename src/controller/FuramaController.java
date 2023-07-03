package controller;

import service.employee.EmployeeService;
import service.employee.IEmployeeService;
import utils.ConsoleColor;

import java.util.*;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    IEmployeeService employeeService = new EmployeeService();

    public void displayEmployeeMenu() {
        boolean flag = true;
        do {
            System.out.println(ConsoleColor.RED_BOLD + "----------MENU EMPLOYEE MANAGEMENT----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.RED + "1.\tDisplay list employees\n" + ConsoleColor.RESET +
                    ConsoleColor.RED + "2.\tAdd new employee\n" + ConsoleColor.RESET +
                    ConsoleColor.RED + "3.\tEdit employee\n" + ConsoleColor.RESET +
                    ConsoleColor.RED + "4.\tReturn main menu" + ConsoleColor.RESET);
            try {
                int choiceEmpManagement = Integer.parseInt(sc.nextLine());
                switch (choiceEmpManagement) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.addNewEmployee();
                        break;
                    case 3:
                        employeeService.edit();
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'EMPLOYEE MANAGEMENT MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }
        } while (flag);
    }

    public void displayCustomerMenu() {
        boolean flag = true;
        do {
            System.out.println(ConsoleColor.CYAN_BOLD + "----------MENU CUSTOMER MANAGEMENT----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.CYAN + "1.\tDisplay list customers\n" + ConsoleColor.RESET +
                    ConsoleColor.CYAN + "2.\tAdd new customer\n" + ConsoleColor.RESET +
                    ConsoleColor.CYAN + "3.\tEdit customer\n" + ConsoleColor.RESET +
                    ConsoleColor.CYAN + "4.\tReturn main menu" + ConsoleColor.RESET);
            try {
                int choiceCusManagement = Integer.parseInt(sc.nextLine());
                switch (choiceCusManagement) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'CUSTOMER MANAGEMENT MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }
        } while (flag);
    }

    public void displayFacility() {
        boolean flag = true;
        do {
            System.out.println(ConsoleColor.GREEN_BOLD + "----------MENU FACILITY MANAGEMENT----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.GREEN + "1\tDisplay list facility\n" + ConsoleColor.RESET +
                    ConsoleColor.GREEN + "2\tAdd new facility\n" + ConsoleColor.RESET +
                    ConsoleColor.GREEN + "3\tDisplay list facility maintenance\n" + ConsoleColor.RESET +
                    ConsoleColor.GREEN + "4\tReturn main menu" + ConsoleColor.RESET);
            try {
                int choiceFacManagement = Integer.parseInt(sc.nextLine());
                switch (choiceFacManagement) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'FACILITY MANAGEMENT MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }
        } while (flag);
    }

    public void displayBookingMenu() {
        boolean flag = true;
        do {
            System.out.println(ConsoleColor.PURPLE_BOLD + "----------MENU BOOKING MANAGEMENT----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.PURPLE + "1.\tAdd new booking\n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE + "2.\tDisplay list booking\n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE + "3.\tCreate new contracts\n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE + "4.\tDisplay list contracts\n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE + "5.\tEdit contracts\n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE + "6.\tReturn main menu" + ConsoleColor.RESET);
            try {
                int choiceBookingManagement = Integer.parseInt(sc.nextLine());
                switch (choiceBookingManagement) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'BOOKING MANAGEMENT MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }
        } while (flag);
    }

    public void displayPromotionMenu() {
        boolean flag = true;
        do {
            System.out.println(ConsoleColor.YELLOW_BOLD + "----------MENU PROMOTION MANAGEMENT----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.YELLOW + "1.\tDisplay list customers use service\n" + ConsoleColor.RESET +
                    ConsoleColor.YELLOW + "2.\tDisplay list customers get voucher\n" + ConsoleColor.RESET +
                    ConsoleColor.YELLOW + "3.\tReturn main menu" + ConsoleColor.RESET);
            try {
                int choiceProManagement = Integer.parseInt(sc.nextLine());
                switch (choiceProManagement) {
                    case 1:
                    case 2:
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'PROMOTION MANAGEMENT MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }
        } while (flag);
    }

    public void displayMainMenu() {
        do {
            System.out.println(ConsoleColor.BLACK_BOLD + ConsoleColor.WHITE_BACKGROUND + "----------MAIN MENU----------" + ConsoleColor.RESET);
            System.out.println(ConsoleColor.RED_UNDERLINED + "1.\tEmployee Management\n" + ConsoleColor.RESET +
                    ConsoleColor.CYAN_UNDERLINED + "2.\tCustomer Management\n" + ConsoleColor.RESET +
                    ConsoleColor.GREEN_UNDERLINED + "3.\tFacility Management \n" + ConsoleColor.RESET +
                    ConsoleColor.PURPLE_UNDERLINED + "4.\tBooking Management\n" + ConsoleColor.RESET +
                    ConsoleColor.YELLOW_UNDERLINED + "5.\tPromotion Management\n" + ConsoleColor.RESET +
                    ConsoleColor.BLUE_UNDERLINED + "6.\tExit" + ConsoleColor.RESET);
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        displayEmployeeMenu();
                        break;
                    case 2:
                        displayCustomerMenu();
                        break;
                    case 3:
                        displayFacility();
                        break;
                    case 4:
                        displayBookingMenu();
                        break;
                    case 5:
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.out.println(ConsoleColor.BLACK_BOLD + ConsoleColor.WHITE_BACKGROUND + "----------SEE YOU AGAIN!----------" + ConsoleColor.RESET);
                        System.exit(0);
                    default:
                        System.out.println("PLEASE CHOSE RIGHT MENU ACCORDING TO THE FOLLOWING " + ConsoleColor.RED_BOLD + "'MAIN MENU'" + ConsoleColor.RESET + "!");
                }
            } catch (NumberFormatException e) {
                System.err.println("WRONG NUMBER FORMAT!");
            }

        } while (true);

    }


}
