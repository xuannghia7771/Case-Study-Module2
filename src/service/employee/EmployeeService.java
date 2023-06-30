package service.employee;

import model.person.Employee;
import repository.employee_repository.EmployeeRepository;
import repository.employee_repository.IEmployeeRepository;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    Scanner sc = new Scanner(System.in);
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void displayList() {

    }

    @Override
    public void addNewEmployee() {
        System.out.println("-----Adding New Employee-----");
        System.out.println("Enter new name: ");
        String name = sc.nextLine();
        System.out.println("Enter new birthday: ");
        String birthday = sc.nextLine();
        System.out.println("Chose gender 1-Male, 0-Female: ");
        int gender = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new IDCard: ");
        String IDCard = sc.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter new email: ");
        String email = sc.nextLine();
        System.out.println("Enter new employeeID: ");
        String employeeID = sc.nextLine();
        System.out.println("Chose academic level 1-Trung cấp, 2-Cao đẳng, 3-Đại học, 4-Sau đại học: ");
        int level = Integer.parseInt(sc.nextLine());
        System.out.println("Chose position 1-Lễ tân, 2-Phục vụ, 3-Chuyên viên, 4-Giám sát, 5-Quản lý, 6-Giám đốc: ");
        int position = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(name,birthday,gender,IDCard,phoneNumber,email,employeeID,level,position,salary);
    }

    @Override
    public void editEmployee() {

    }
}
