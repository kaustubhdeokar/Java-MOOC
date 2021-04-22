package hr.personnel;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);

    }

    @Override public int getNbHoursPerWeek() {
        return 20;
    }

}
