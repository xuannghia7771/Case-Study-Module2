package repository.employee_repository;

import java.util.*;

import model.person.Employee;
import utils.ReadAndWriteFile;

public class EmployeeRepository implements IEmployeeRepository {

    final String EMPLOYEE_PATH_FILE = "src/data/Employee.csv";

    public List<Employee> getDataFromFile() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(EMPLOYEE_PATH_FILE);
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            /*String name, String birthday, boolean gender, String IDCard, String phoneNumber, String email, String employeeID, int academicLevel, int position, int salary*/
            Employee employee = new Employee(info[0], info[1], Boolean.parseBoolean(info[2]), info[3], info[4], info[5], info[6], info[7], info[8], info[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }
    @Override
    public void addIntoRepo(Employee employee) {
        ReadAndWriteFile.writeFile(EMPLOYEE_PATH_FILE, employee.getInfo(), true);
        System.out.println("Successfully!");
    }
    @Override
    public void edit(int index, Employee employee) {
        List<String> stringList = ReadAndWriteFile.readFile(EMPLOYEE_PATH_FILE);
        stringList.set(index, employee.getInfo());
        ReadAndWriteFile.updateFile(EMPLOYEE_PATH_FILE, stringList);
    }
    @Override
    public int searchID(String id) {
        int index = -1;
        List<Employee> employeeList = getDataFromFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeID().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Employee getElement(int index) {
        List<Employee> employeeList = getDataFromFile();
        return employeeList.get(index);
    }

}
