package hr.personnel;

public class Intern extends Employee {

    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
    }

    @Override public int getNbHoursPerWeek() {
        return 10;
    }
}
