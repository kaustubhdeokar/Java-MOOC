package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.FullTimeEmployee;
import hr.personnel.PartTimeEmployee;

public class EmployeeTaxCalculatorFactory {

    public static EmployeeTaxCalculator create(Employee employeeType){
        if(employeeType instanceof FullTimeEmployee){
            return new FullTimeTaxCalculator();
        }
        else if(employeeType instanceof PartTimeEmployee){
            return new PartTimeTaxCalculator();
        }
        else{
            return new InternTaxCalculator();
        }
    }

}
