package DTO;
import java.time.LocalDate;
public class LibrarySlip {
    private String librarySlipID;
    private String userID;
    private LocalDate borrowedDay;
    private LocalDate dueDate;
    private String loanStatus;

    public String getLibrarySlipID() {
        return librarySlipID;
    }

    public void setLibrarySlipID(String librarySlipID) {
        this.librarySlipID = librarySlipID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public LocalDate getBorrowedDay() {
        return borrowedDay;
    }

    public void setBorrowedDay(LocalDate borrowedDay) {
        this.borrowedDay = borrowedDay;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public LibrarySlip() {
    }

    public LibrarySlip(String librarySlipID, String userID, LocalDate borrowedDay, LocalDate dueDate, String loanStatus) {
        this.librarySlipID = librarySlipID;
        this.userID = userID;
        this.borrowedDay = borrowedDay;
        this.dueDate = dueDate;
        this.loanStatus = loanStatus;
    }
}
