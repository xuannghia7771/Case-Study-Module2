package repository.customer_repository;

import model.person.Customer;
import model.person.Employee;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    final String CUSTOMER_PATH_FILE = "src/data/Customer.csv";

    @Override
    public void addIntoRepo(Customer customer) {
        ReadAndWriteFile.writeFile(CUSTOMER_PATH_FILE, customer.getInfo(), true);
        System.out.println("Successfully!");
    }

    @Override
    public List<Customer> getDataFromFile() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(CUSTOMER_PATH_FILE);
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            /*String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String customerID, String type, String address*/
            Customer customer = new Customer(info[0], info[1], Boolean.parseBoolean(info[2]), info[3], info[4], info[5], info[6], info[7], info[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public int searchID(String id) {
        int index = -1;
        List<Customer> customerList = getDataFromFile();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerID().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Customer getElement(int index) {
        List<Customer> customerList = getDataFromFile();
        return customerList.get(index);
    }

    @Override
    public void edit(int index, Customer customer) {
        List<String> stringList = ReadAndWriteFile.readFile(CUSTOMER_PATH_FILE);
        stringList.set(index, customer.getInfo());
        ReadAndWriteFile.updateFile(CUSTOMER_PATH_FILE, stringList);
    }
}
