package hr.personnel;

import hr.taxes.EmployeeTaxCalculator;
import hr.taxes.EmployeeTaxCalculatorFactory;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
    }

    @Override
    public int getNbHoursPerWeek() {
        return 40;
    }




}
