package hr.taxes;

import hr.personnel.Employee;

public class InternTaxCalculator implements EmployeeTaxCalculator{

    double incomeTaxPercentage = 10;

    @Override
    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome()<3500){
            return 0;
        }
        else{
            return employee.getMonthlyIncome()*incomeTaxPercentage/100;
        }
    }
}
