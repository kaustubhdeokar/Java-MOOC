package hr.taxes;

import hr.personnel.Employee;

public class FullTimeTaxCalculator implements EmployeeTaxCalculator{

    protected double retirementTaxPercentage = 10;
    protected double incomeTaxPercentage = 10;
    protected double baseHealthInsurance = 5000;

    @Override
    public double calculate(Employee employee) {
        return baseHealthInsurance +
                (employee.getMonthlyIncome()*12)*incomeTaxPercentage/100 +
                (employee.getMonthlyIncome()*12)*retirementTaxPercentage/100;

    }
}
