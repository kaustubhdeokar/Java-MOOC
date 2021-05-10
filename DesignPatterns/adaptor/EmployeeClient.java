import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {



    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        employees.addAll(CompanyAEmployee.getInstance().getSampleEmployees());
        employees.addAll(CompanyBEmployee.getInstance().getSampleEmployees());

        return employees;

    }
}
