package hr.personnel;

import hr.taxes.EmployeeTaxCalculator;
import hr.taxes.EmployeeTaxCalculatorFactory;

/*
Models an employee form a business perspective
 */
public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;


    public Employee(String fullName, int monthlyIncome) {
        setMonthlyIncome(monthlyIncome);

        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getEmail() {
        return this.firstName + "." +
                this.lastName +
                "@globomanticshr.com";
    }

    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName + " - " +
                this.monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if (monthlyIncome < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }

        this.monthlyIncome = monthlyIncome;
    }

    public double getTax(){
        EmployeeTaxCalculator employeeTaxCalculator = EmployeeTaxCalculatorFactory.create(this);
        return employeeTaxCalculator.calculate(this);
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        if (nbHoursPerWeek <= 0) {
            throw new IllegalArgumentException("Income must be positive");
        }

        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }


}

