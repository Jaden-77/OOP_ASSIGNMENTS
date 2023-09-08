/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Date;
import java.text.SimpleDateFormat;
        
        
public class HourlyEmployee {
    
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    
   public HourlyEmployee(int id, String name){
        this.empID = id;
        this.empName = name;
    }
   
   
    public HourlyEmployee(Date dHired, Date bDay){
        this.empDateHired = dHired;
        this.empBirthDate = bDay;
    }
    
    
    public HourlyEmployee(float totalHr, float rPerHr){
        this.totalHoursWorked = totalHr;
        this.ratePerHour = rPerHr;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
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

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    
    public double computeSalary(){
       
        float otHrs;
        double otRate, totalRate;
        
        if(totalHoursWorked > 40){
           otHrs = totalHoursWorked - 40;
           otRate = otHrs * 1.5;
           totalRate = (40 * ratePerHour) + otRate;
        }
        else{
            totalRate = totalHoursWorked * ratePerHour;
        }
        
       return totalRate;
    }
    
    
    public void displayInfo(){
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    System.out.println("Employee ID: " + empID);
    System.out.println("Employee Name: " + empName);
    System.out.println("Date Hired: " + dateFormat.format(empDateHired));
    System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
    System.out.println("Total Hours Worked: " + totalHoursWorked + " hours");
    System.out.println("Rate Per Hour: ₱" + ratePerHour);
    System.out.println("Salary: ₱" + computeSalary());
        
    }
    
}