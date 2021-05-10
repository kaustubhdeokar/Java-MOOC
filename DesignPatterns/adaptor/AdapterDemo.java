import java.util.Comparator;
import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {

		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();

		employees.forEach(emp -> {
			System.out.println(emp.getId());
		});
	}

	public Comparator<Employee> getEmployeeIdComparator(){

		return Comparator.comparingInt(employee -> Integer.parseInt(employee.getId()));
	}

}
