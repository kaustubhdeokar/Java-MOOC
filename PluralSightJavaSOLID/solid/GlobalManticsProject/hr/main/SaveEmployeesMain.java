package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeRepository;
import hr.persistence.EmployeeSerializer;
import hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeSerializer employeeSerializer = new EmployeeSerializer();
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        // Save all
        for (Employee e : employees){
            try {
                repository.save(e,employeeSerializer);
                consoleLogger.log("Saved employee"+e.toString());
            } catch (IOException ioException) {
                consoleLogger.log("Error saving employee",ioException);
                ioException.printStackTrace();
            }
        }
    }
}
