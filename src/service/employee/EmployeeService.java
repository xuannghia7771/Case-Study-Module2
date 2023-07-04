package service.employee;

import model.person.Employee;
import repository.employee_repository.EmployeeRepository;
import repository.employee_repository.IEmployeeRepository;
import utils.Regex;
import utils.RegexAge;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    Scanner sc = new Scanner(System.in);
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getDataFromFile();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        //List<Employee> employeeList = employeeRepository.display();
        System.out.println("-----Adding New Employee-----");
        String name = Regex.validateName();
        String birthday=RegexAge.validateBirth();
        boolean gender = Boolean.parseBoolean(Regex.validateGender());
        String IDCard = Regex.validateIDCard();
        String phoneNumber = Regex.validatePhoneNumber();
        String email = Regex.validateEmail();
        String employeeID;
        int index;
        do {
            employeeID = Regex.validateEmployeeID();
            index = employeeRepository.searchID(employeeID);
            if (index != -1) {
                System.out.println("EMPLOYEE ID HAS ALREADY EXISTED!");
            }
        } while (index != -1);
        int level = Regex.validateAcademicLevel();
        int position = Regex.validatePosition();
        int salary = Regex.validateSalary();
        Employee employee = new Employee(name,birthday,gender,IDCard,phoneNumber,email,employeeID,level,position,salary);
        employeeRepository.addIntoRepo(employee);
    }
    @Override
    public void edit() {
        display();
        System.out.println("Enter id of employee you want to edit: ");
        String id;
        int index;
        do {
            id = Regex.validateEmployeeID();
            index = employeeRepository.searchID(id);
            if (index == -1) {
                System.out.println("EMPLOYEE ID HAS NOT EXISTED!");
            }
        } while (index == -1);
        String name = null;
        String birthday = null;
        boolean gender = false;
        String IDCard = null;
        String phoneNumber = null;
        String email = null;
        int level = 0;
        int position = 0;
        int salary = 0;
        boolean flag = true;
        do {
            System.out.println("WHAT DO YOU WANT TO EDIT:\n" +
                    "1.Name\n" +
                    "2.Day of birth\n" +
                    "3.Gender\n" +
                    "4.ID Card\n" +
                    "5.Phone number\n" +
                    "6.Email\n" +
                    "7.Level\n" +
                    "8.Position\n" +
                    "9.salary\n" +
                    "10.Exit");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    name = Regex.validateName();
                    break;
                case "2":
                    birthday=RegexAge.validateBirth();
                    break;
                case "3":
                    gender = Boolean.parseBoolean(Regex.validateGender());
                    break;
                case "4":
                    IDCard = Regex.validateIDCard();
                    break;
                case "5":
                    phoneNumber = Regex.validatePhoneNumber();
                    break;
                case "6":
                    email = Regex.validateEmail();
                    break;
                case "7":
                    level = Regex.validateAcademicLevel();
                    break;
                case "8":
                    position = Regex.validatePosition();
                    break;
                case "9":
                    salary = Regex.validateSalary();
                    break;
                case "10":
                    flag = false;
                    break;
                default:
                    System.out.println("WRONG CHOICE!");
            }
        } while (flag);
        Employee editEmployee = new Employee(name,birthday,gender,IDCard,phoneNumber,email,id,level,position,salary);
        employeeRepository.edit(index, editEmployee);
    }
}
