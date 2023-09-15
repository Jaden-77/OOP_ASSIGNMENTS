
package employee_version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate,
                                      double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    // Getter and setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Compute salary by adding commission on sales to base salary
    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    // Display employee information including base salary
    @Override
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: $" + baseSalary + "\nTotal Salary: $" + computeSalary();
    }
}
