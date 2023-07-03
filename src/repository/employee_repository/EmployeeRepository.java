package repository.employee_repository;

import java.util.*;
import model.person.Employee;
import utils.ReadAndWriteFile;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();
    final String EMPLOYEE_PATH_FILE = "src/data/Employee.csv";
    public List<Employee> display() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(EMPLOYEE_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Employee employee = new Employee(info[0], info[1], Integer.parseInt(info[2]), info[3],
                    info[4], info[5], info[6], Integer.parseInt(info[7]), Integer.parseInt(info[8]), Integer.parseInt(info[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    public void addIntoRepo(Employee employee){
        ReadAndWriteFile.writeFile(EMPLOYEE_PATH_FILE,employee.getInfo(),true);
        System.out.println("Successfully!");
    }
    @Override
    public void edit(int index, Employee employee) {
        employeeList.set(index, employee);
        updateFile();
    }
    @Override
    public void updateFile() {
        String line;
        List<String> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            line = employee.getEmployeeID() + "," +
                    employee.getName() + "," +
                    employee.getBirthday() + "," +
                    employee.getGender() + "," +
                    employee.getIDCard() + "," +
                    employee.getPhoneNumber() + "," +
                    employee.getEmail() + "," +
                    employee.getAcademicLevel() + "," +
                    employee.getPosition() + "," +
                    employee.getSalary();
            list.add(line);
        }
        ReadAndWriteFile.updateFile(EMPLOYEE_PATH_FILE, list);
    }
    @Override
    public int searchID(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeID().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public Employee getElement(int index) {
        return employeeList.get(index);
    }
}
