package service.employee;

import service.IService;

public interface IEmployeeService extends IService {
    void display();
    void addNewEmployee();
    void edit();

}
