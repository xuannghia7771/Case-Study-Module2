package service.customer;

import model.person.Customer;
import model.person.Employee;
import repository.customer_repository.CustomerRepository;
import repository.customer_repository.ICustomerRepository;
import repository.employee_repository.EmployeeRepository;
import repository.employee_repository.IEmployeeRepository;
import utils.Regex;
import utils.RegexAge;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void display() {
        List<Customer> customerList = customerRepository.getDataFromFile();
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewCustomer() {
//List<Employee> employeeList = employeeRepository.display();
        /*String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String customerID, int customerType, String address*/
        System.out.println("-----Adding New Customer-----");
        String name = Regex.validateName();
        String birthday= RegexAge.validateBirth();
        boolean gender = Boolean.parseBoolean(Regex.validateGender());
        String IDCard = Regex.validateIDCard();
        String phoneNumber = Regex.validatePhoneNumber();
        String email = Regex.validateEmail();
        String customerID;
        int index;
        do {
            customerID = Regex.validateCustomerID();
            index = customerRepository.searchID(customerID);
            if (index != -1) {
                System.out.println("CUSTOMER ID HAS ALREADY EXISTED!");
            }
        } while (index != -1);
        int customerType = Regex.validateCustomerType();
        String address = sc.nextLine();
        Customer customer = new Customer(name,birthday,gender,IDCard,phoneNumber,email,customerID,customerType,address);
        customerRepository.addIntoRepo(customer);
    }

    @Override
    public void edit() {

    }
}
