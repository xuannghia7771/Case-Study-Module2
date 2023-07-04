package repository.customer_repository;

import model.person.Customer;
import repository.IRepository;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    void addIntoRepo(Customer customer);

    List<Customer> getDataFromFile();

    int searchID(String id);

    Customer getElement(int index);
    void edit(int index, Customer customer);
}
