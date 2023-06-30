package service.employee;

import service.IService;

public interface IEmployeeService extends IService {
    void displayList();
    void addNewEmployee();
    void editEmployee();
}
