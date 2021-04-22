package hr.persistence;

import hr.personnel.Employee;

public class EmployeeSerializer {

    public String serialise(Employee employee){

        String employeeReport = "### EMPLOYEE RECORD ####" +
                System.lineSeparator() +
                "NAME: " +
                employee.getFullName() +
                System.lineSeparator() +
                "POSITION: " +
                employee.getClass().getTypeName() +
                System.lineSeparator() +
                "EMAIL: " +
                employee.getEmail() +
                System.lineSeparator() +
                "MONTHLY WAGE: " +
                employee.getMonthlyIncome() +
                System.lineSeparator()+
                "INCOME TAX"+
                employee.getTax();

        return employeeReport;
    }

}
