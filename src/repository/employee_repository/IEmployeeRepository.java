package repository.employee_repository;

import model.person.Employee;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    void addIntoRepo(Employee employee);
    List<Employee> display();
    void updateFile();
    int searchID(String id);
    Employee getElement(int index);
    void edit(int index, Employee employee);
}
