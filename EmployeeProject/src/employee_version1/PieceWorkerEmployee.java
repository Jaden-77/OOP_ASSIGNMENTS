package employee_version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PieceWorkerEmployee {
      private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    // Constructors
    public PieceWorkerEmployee() {
        // Default constructor
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate,
            int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        this(empID, empName, new Date(), new Date(), totalPiecesFinished, ratePerPiece);
    }

    // Accessors and mutators
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    // Compute salary
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        int bonusCount = totalPiecesFinished / 100;
        double bonus = bonusCount * (10 * ratePerPiece);
        return salary + bonus;
    }

    // Display employee information
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: ₱" + ratePerPiece);
        System.out.println("Salary: ₱" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate Hired: " + empDateHired
                + "\nDate of Birth: " + empBirthDate + "\nTotal Pieces Finished: " + totalPiecesFinished
                + "\nRate per Piece: $" + ratePerPiece + "\nSalary: $" + computeSalary();
    }
}

