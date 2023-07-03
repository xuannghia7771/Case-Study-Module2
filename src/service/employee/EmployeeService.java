package service.employee;

import model.person.Employee;
import repository.employee_repository.EmployeeRepository;
import repository.employee_repository.IEmployeeRepository;
import utils.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    Scanner sc = new Scanner(System.in);
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("-----Adding New Employee-----");
        String name = Regex.validateName();
        String birthday = Regex.validateBirth();
        int gender = Regex.validateGender();
        String IDCard = Regex.validateIDCard();
        String phoneNumber = Regex.validatePhoneNumber();
        String email = Regex.validateEmail();
        String employeeID = Regex.validateEmployeeID();
        int level = Regex.validateAcademicLevel();
        int position = Regex.validatePosition();
        int salary = Regex.validateSalary();
        Employee employee = new Employee(name,birthday,gender,IDCard,phoneNumber,email,employeeID,level,position,salary);
        employeeRepository.addIntoRepo(employee);
    }
    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên muốn sửa, ");
        String id = Regex.validateEmployeeID();
        int index = employeeRepository.searchID(id);
        if (index == -1) {
            System.out.println("id Không tồn tại!");
        } else {
            String name = Regex.validateName();
            String date = Regex.validateBirth();
            int gender = Regex.validateGender();
            String IDCard = Regex.validateIDCard();
            String phoneNumber = Regex.validatePhoneNumber();
            String email = Regex.validateEmail();
            String employeeID = Regex.validateEmployeeID();
            int level = Regex.validateAcademicLevel();
            int position = Regex.validatePosition();
            int salary = Regex.validateSalary();

            Employee editEmployee = new Employee(name,date,gender,IDCard,phoneNumber,email,employeeID,level,position,salary);
            employeeRepository.edit(index, editEmployee);
        }

    }
}
