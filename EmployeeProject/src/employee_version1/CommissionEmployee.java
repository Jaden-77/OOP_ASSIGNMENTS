
package employee_version1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CommissionEmployee {
    
      private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public CommissionEmployee() {
        // Default constructor
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }
    
    // Getters and setters for totalSales
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Compute salary based on total sales
    public double computeSalary() {
        if (totalSales < 50000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }

    // Display employee information
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
        System.out.println("Total Sales: ₱" + totalSales);
        System.out.println("Salary: ₱" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate Hired: " + empDateHired
                + "\nDate of Birth: " + empBirthDate + "\nTotal Sales: $" + totalSales + "\nSalary: $"
                + computeSalary();
    }
}
