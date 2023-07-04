package service.customer;

import service.IService;

public interface ICustomerService extends IService {
    void display();
    void addNewCustomer();
    void edit();
}
